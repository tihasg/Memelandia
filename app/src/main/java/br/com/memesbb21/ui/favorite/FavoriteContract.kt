package br.com.memesbb21.ui.favorite

import br.com.memesbb21.model.MemeModel
import br.com.memesbb21.ui.base.BaseContract

interface FavoriteContract {

    interface View : BaseContract.View {
        fun displayError(msg: String?)
        fun showLoading(loading : Boolean)
        fun setList(list : List<MemeModel>)
        fun initList()
        fun displayMessageNotFavorite()
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun getListFavorited()
        fun setError(error : Throwable)
        fun sharedMeme(memeModel: MemeModel)
        fun favoriteMeme(memeModel: MemeModel)
    }

}