package br.com.memes.ui.home

import br.com.memes.model.MemeModel
import br.com.memes.ui.base.BaseContract

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
    }

}