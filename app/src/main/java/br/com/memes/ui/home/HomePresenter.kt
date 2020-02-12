package br.com.memes.ui.home

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

class HomePresenter(private val mContext : Context) : HomeContract.Presenter {

    private var mView : HomeContract.View? = null
    var memes: ArrayList<MemeModel> = ArrayList()


    override fun getList() {
        var allMemes = MyApplication.database?.memeDao()?.getAllMemes()

        if(allMemes != null && allMemes.isEmpty()){
            val typeToken = object : TypeToken<ArrayList<MemeModel>>() {}.type
            val listMemes = Gson().fromJson<ArrayList<MemeModel>>(loadJSONFromAsset(), typeToken)

            listMemes.forEach {
                MyApplication.database?.memeDao()?.insertMeme(it)
            }

            allMemes = MyApplication.database?.memeDao()?.getAllMemes()

        }

        allMemes?.let { mView?.setList(it) }
    }

    override fun setError(error: Throwable) {

    }


    override fun sharedMeme(memeModel: MemeModel) {
        mView?.notifyDataChanged()
        mView?.displayShare()
    }


    override fun favoriteMeme(memeModel: MemeModel) {
        memeModel.isFavorite = !memeModel.isFavorite
        MyApplication.database?.memeDao()?.updateMeme(memeModel)
        mView?.notifyDataChanged()

        if(memeModel.isFavorite){
            mView?.displayMessageFavorite()
        } else {
            mView?.displayMessageNotFavorite()
        }
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