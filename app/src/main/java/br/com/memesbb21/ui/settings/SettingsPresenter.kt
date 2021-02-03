package br.com.memesbb21.ui.settings

import android.content.Context

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