package br.com.memes.ui.favorite

import android.content.Context
import br.com.memes.MyApplication
import br.com.memes.model.MemeModel

class FavoritePresenter(private val mContext : Context) : FavoriteContract.Presenter {

    private var mView : FavoriteContract.View? = null
    var memes: ArrayList<MemeModel> = ArrayList()


    override fun getListFavorited() {
        val allMemes = MyApplication.database?.memeDao()?.loadMemeFavorited(true)
        allMemes?.let { mView?.setList(it) }
    }

    override fun setError(error: Throwable) {

    }


    override fun sharedMeme(memeModel: MemeModel) {

    }


    override fun favoriteMeme(memeModel: MemeModel) {
        memeModel.isFavorite = !memeModel.isFavorite
        MyApplication.database?.memeDao()?.updateMeme(memeModel)
        mView?.initList()
        mView?.displayMessageNotFavorite()
    }

    override fun attach(view: FavoriteContract.View) {
        mView = view
    }

    override fun detach() {
        mView = null
    }

}