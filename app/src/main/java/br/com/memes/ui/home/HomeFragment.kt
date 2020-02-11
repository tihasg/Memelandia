package br.com.memes.ui.home

import android.content.Intent
import android.content.res.AssetManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.memes.R
import br.com.memes.extensions.setup
import br.com.memes.model.MemeModel
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.*

class HomeFragment : Fragment(), HomeContract.View {

    private var mPresenter : HomePresenter? = null

    private val mAdapter by lazy {
        val adapter = context?.let {
            MemeAdapter(it, object : MemeAdapter.OnItemClickListener{
                override fun onItemClicked(item: MemeModel) {
                    mPresenter?.playerAudio(item)
                }

                override fun onShareClicked(item: MemeModel) {
                   sharedMeme(item)
                }

                override fun onFavoriteClicked(item: MemeModel) {
                    mPresenter?.favoriteMeme(item)
                }
            })
        }
        adapter?.let {rv_meme.setup(it, layoutManager = GridLayoutManager(context, 3))}
        adapter
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        mPresenter = HomePresenter(this.context!!)
        mPresenter?.attach(this)
        mPresenter?.getList()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun displayError(msg: String?) {

    }

    override fun showLoading(loading: Boolean) {
    }

    override fun setList(list: ArrayList<MemeModel>) {
        mAdapter?.setMeme(list)
    }

    private fun sharedMeme(memeModel: MemeModel){
        val f = File(context?.filesDir, "estudantenaoquerserestudante.mp3")
        if (!f.exists()) {
            val assets: AssetManager = context?.assets!!
            try {
                copy(assets.open("estudantenaoquerserestudante.mp3"), f)
            } catch (e: IOException) {
                Log.e("FileProvider", "Exception copying from assets", e)
                return
            }
        }
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        sharingIntent.type = "audio/mp3"
        sharingIntent.putExtra(Intent.EXTRA_STREAM, R.a)
        context!!.startActivity(Intent.createChooser(sharingIntent, "Compartilhar o som do meme no"))
    }

    @Throws(IOException::class)
    private fun copy(inputStream: InputStream, dst: File) {
        val out = FileOutputStream(dst)
        val buf = ByteArray(inputStream.available())
        var len: Int
        while (inputStream.read(buf).also { len = it } > 0) {
            out.write(buf, 0, len)
        }
        inputStream.close()
        out.close()
    }
}