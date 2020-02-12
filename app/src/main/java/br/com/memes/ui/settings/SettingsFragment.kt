package br.com.memes.ui.settings

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.memes.R

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