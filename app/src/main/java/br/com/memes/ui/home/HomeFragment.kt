package br.com.memes.ui.home

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.memes.R
import br.com.memes.extensions.setup
import br.com.memes.model.MemeModel
import br.com.memes.model.SetMemes
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.IOException
import java.util.*

class HomeFragment : Fragment() {

    var memes: ArrayList<MemeModel> = ArrayList<MemeModel>()
    private var player : MediaPlayer? = null

    private val mAdapter by lazy {
        val adapter = context?.let {
            MemeAdapter(it, object : MemeAdapter.OnItemClickListener{
                override fun onItemClicked(item: MemeModel) {
                    playAudio(item.audio)
                }
            })
        }
        adapter?.let {
            rv_meme.setup(
                it, layoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL
                ))
        }
        adapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAdapter?.setMeme(SetMemes.setMemes(memes))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    fun playAudio(fileName: String?) {
        try {
            val afd: AssetFileDescriptor = context?.assets!!.openFd(fileName.toString())
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
}