package br.com.memes.ui.settings

import android.content.Context
import br.com.memes.MyApplication
import br.com.memes.model.MemeModel

class SettingsPresenter(private val mContext : Context) : SettingsContract.Presenter {

    private var mView : SettingsContract.View? = null

    override fun setError(error: Throwable) {

    }

    override fun attach(view: SettingsContract.View) {
        mView = view
    }

    override fun detach() {
        mView = null
    }

}