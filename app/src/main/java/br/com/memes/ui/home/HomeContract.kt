package br.com.memes.ui.home

import br.com.memes.model.MemeModel
import br.com.memes.ui.base.BaseContract
import java.util.ArrayList

interface HomeContract {

    interface View : BaseContract.View {
        fun displayError(msg: String?)
        fun showLoading(loading : Boolean)
        fun setList(list : ArrayList<MemeModel>)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun getList()
        fun setError(error : Throwable)
        fun playerAudio(memeModel: MemeModel)
        fun sharedMeme(memeModel: MemeModel)
        fun favoriteMeme(memeModel: MemeModel)
    }

}