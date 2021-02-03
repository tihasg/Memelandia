package br.com.memesbb21.ui.home

import br.com.memesbb21.model.MemeModel
import br.com.memesbb21.ui.base.BaseContract

interface HomeContract {

    interface View : BaseContract.View {
        fun displayError(msg: String?)
        fun showLoading(loading : Boolean)
        fun setList(list : List<MemeModel>)
        fun notifyDataChanged()
        fun displayMessageFavorite()
        fun displayMessageNotFavorite()
        fun displayShare()
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun getList()
        fun setError(error : Throwable)
        fun sharedMeme(memeModel: MemeModel)
        fun favoriteMeme(memeModel: MemeModel)
        fun searchMeme(text : String)
    }

}