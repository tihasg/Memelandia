package br.com.memesbb21.ui.settings

import android.app.Activity
import android.app.AlertDialog
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.memesbb21.MainActivity
import br.com.memesbb21.R
import com.skydoves.colorpickerview.ColorEnvelope
import com.skydoves.colorpickerview.ColorPickerDialog
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment(), SettingsContract.View {

    private var mPresenter: SettingsPresenter? = null
    private var memesManager: MemesManager? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        mPresenter = SettingsPresenter(this.context!!)
        memesManager = MemesManager(this.context!!)
        mPresenter?.attach(this)

        theme_color_img.setBackgroundColor(Color.parseColor(memesManager?.color))
        theme_card.setOnClickListener {
            val builder =
                ColorPickerDialog.Builder(this.context!!, AlertDialog.THEME_DEVICE_DEFAULT_DARK)
                    .setTitle(getString(R.string.settings_escolhe))
                    .setPositiveButton(
                        getString(R.string.setting_confimar),
                        ColorEnvelopeListener { envelope, _ -> setLayoutColor(envelope) })
                    .setNegativeButton(
                        getString(R.string.settings_cancel)
                    ) { dialogInterface, _ -> dialogInterface.dismiss() }
            builder.setCancelable(false)
            builder.show()

        }

        reset_settings_card.setOnClickListener { view ->
            val alertDialog =
                AlertDialog.Builder(view.context).create()
            alertDialog.setTitle(getString(R.string.setting_redifinir))
            alertDialog.setMessage(getString(R.string.setting_op_txt))
            alertDialog.setButton(
                AlertDialog.BUTTON_POSITIVE, getString(R.string.settings_restaurar)
            ) { dialog, which ->
                resetAllSettings()
                Toast.makeText(
                    context,
                    getString(R.string.settings_rest_sucess),
                    Toast.LENGTH_LONG
                ).show()
            }
            alertDialog.setButton(
                AlertDialog.BUTTON_NEGATIVE, getString(R.string.settings_cancel)
            ) { dialog, which -> dialog.cancel() }
            alertDialog.create()
            alertDialog.setOnShowListener {
                alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
                    .setTextColor(Color.parseColor(memesManager?.color))
                alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)
                    .setTextColor(Color.parseColor(memesManager?.color))
            }
            alertDialog.show()
        }
    }

    fun resetAllSettings() {
        setHomeActivityColor(Color.parseColor("#282828"))
    }

    fun setHomeActivityColor(color: Int) {
        memesManager?.color = "#282828"
        Color.parseColor(memesManager?.color)
        theme_color_img.setBackgroundColor(color)
        setColor()
    }

    fun getDarkColor(color: Int): Int {
        var darkColor = 0
        val r = Math.max(Color.red(color) - 25, 0)
        val g = Math.max(Color.green(color) - 25, 0)
        val b = Math.max(Color.blue(color) - 25, 0)
        darkColor = Color.rgb(r, g, b)
        return darkColor
    }

    override fun displayError(msg: String?) {

    }

    override fun showLoading(loading: Boolean) {
    }

    override fun setLayoutColor(envelope: ColorEnvelope?) {
        theme_color_img.setBackgroundColor(Color.parseColor("#" + envelope?.hexCode))
        memesManager?.color = "#" + envelope?.hexCode
        setColor()
    }

    fun setColor(){
        MainActivity.tooBar!!.setBackgroundColor(Color.parseColor(memesManager?.color))
        MainActivity.navView!!.setBackgroundColor(Color.parseColor(memesManager?.color))
        if (Build.VERSION.SDK_INT >= 21) {
            val window = (context as Activity?)!!.window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = getDarkColor(Color.parseColor(memesManager?.color))
        }
    }


}