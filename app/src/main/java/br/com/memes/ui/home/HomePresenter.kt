package br.com.memes.ui.home

import android.content.Context
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.content.res.AssetManager
import android.media.MediaPlayer
import android.util.Log
import androidx.core.content.FileProvider
import br.com.memes.model.MemeModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

class HomePresenter(private val mContext : Context) : HomeContract.Presenter {

    private var mView : HomeContract.View? = null
    var memes: ArrayList<MemeModel> = ArrayList()
    private var player : MediaPlayer? = null

    override fun getList() {
        val typeToken = object : TypeToken<ArrayList<MemeModel>>() {}.type
        val listMemes = Gson().fromJson<ArrayList<MemeModel>>(loadJSONFromAsset(), typeToken)
        mView?.setList(listMemes)
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

    private fun loadJSONFromAsset() : String {
        var json  = ""
        try {
            val inputStream : InputStream = mContext.assets.open("meme.json")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, Charset.forName("UTF-8"))
        } catch ( e : Exception ){
            e.printStackTrace()
            return ""
        }
        return json
    }
}