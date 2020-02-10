package br.com.memes.ui.home

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import br.com.memes.model.MemeModel
import br.com.memes.model.SetMemes
import java.io.IOException
import java.util.ArrayList

class HomePresenter(private val mContext : Context) : HomeContract.Presenter {

    private  var mView : HomeContract.View? = null
    var memes: ArrayList<MemeModel> = ArrayList()
    private var player : MediaPlayer? = null

    override fun getList() {
        mView?.setList(SetMemes.setMemes(memes))
    }

    override fun setError(error: Throwable) {

    }

    override fun playerAudio(memeModel: MemeModel) {
        try {
            val afd: AssetFileDescriptor = mContext.assets!!.openFd(memeModel.audio)
            if (player != null) {
                player!!.stop()
                player!!.reset()
            }
            player = MediaPlayer()
            player!!.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
            player!!.prepare()
            player!!.start()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    override fun sharedMeme(memeModel: MemeModel) {

    }

    override fun favoriteMeme(memeModel: MemeModel) {
        memeModel.isFavorite = true
    }

    override fun attach(view: HomeContract.View) {
        mView = view
    }

    override fun detach() {
        mView = null
    }
}