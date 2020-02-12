package br.com.memes.ui.gallery

import android.content.Context
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.content.res.AssetManager
import android.media.MediaPlayer
import android.util.Log
import androidx.core.content.FileProvider
import br.com.memes.MyApplication
import br.com.memes.model.MemeModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

class GalleryPresenter(private val mContext : Context) : GalleryContract.Presenter {

    private var mView : GalleryContract.View? = null
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

    override fun attach(view: GalleryContract.View) {
        mView = view
    }

    override fun detach() {
        mView = null
    }

}