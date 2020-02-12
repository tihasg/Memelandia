package br.com.memes.ui.settings

import br.com.memes.model.MemeModel
import br.com.memes.ui.base.BaseContract

interface SettingsContract {

    interface View : BaseContract.View {
        fun displayError(msg: String?)
        fun showLoading(loading : Boolean)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun setError(error : Throwable)
    }

}