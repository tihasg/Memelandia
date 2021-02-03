package br.com.memesbb21.ui.settings

import br.com.memesbb21.ui.base.BaseContract
import com.skydoves.colorpickerview.ColorEnvelope

interface SettingsContract {

    interface View : BaseContract.View {
        fun displayError(msg: String?)
        fun showLoading(loading : Boolean)
        abstract fun setLayoutColor(envelope: ColorEnvelope?)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun setError(error : Throwable)
    }

}