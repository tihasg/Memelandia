package br.com.memes.ui.gallery

import br.com.memes.model.MemeModel
import br.com.memes.ui.base.BaseContract
import java.util.ArrayList

interface GalleryContract {

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