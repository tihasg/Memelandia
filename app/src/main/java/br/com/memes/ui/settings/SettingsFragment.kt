package br.com.memes.ui.settings

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
import br.com.memes.MainActivity
import br.com.memes.R
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment(), SettingsContract.View {

    private var mPresenter : SettingsPresenter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        mPresenter = SettingsPresenter(this.context!!)
        mPresenter?.attach(this)

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
                    .setTextColor(MainActivity.themeColor)
                alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)
                    .setTextColor(MainActivity.themeColor)
            }
            alertDialog.show()
        }
    }

    fun resetAllSettings() {
        setHomeActivityColor(Settings.DEF_THEME_COLOR)
    }

    fun setHomeActivityColor(color: Int) {
        MainActivity.settings?.themeColor= color
        MainActivity.themeColor = color
        theme_color_img.setBackgroundColor(color)
        if (Build.VERSION.SDK_INT >= 21) {
            val window = (context as Activity?)!!.window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = getDarkColor(color)
        }
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

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}