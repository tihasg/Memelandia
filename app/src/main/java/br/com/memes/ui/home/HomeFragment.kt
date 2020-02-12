package br.com.memes.ui.home

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.memes.R
import br.com.memes.utils.extensions.setup
import br.com.memes.model.MemeModel
import br.com.memes.utils.ShareSom
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream


class HomeFragment : Fragment(), HomeContract.View {

    private var mPresenter : HomePresenter? = null
    private var player : MediaPlayer? = null

    private val mAdapter by lazy {
        val adapter = context?.let {
            MemeAdapter(it, object : MemeAdapter.OnItemClickListener{
                override fun onItemClicked(item: MemeModel) {
                    playerAudio(item)
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun displayError(msg: String?) {

    }

    override fun showLoading(loading: Boolean) {
    }

    override fun setList(list: List<MemeModel>) {
        mAdapter?.setMeme(list)
    }

    override fun notifyDataChanged() {
        mAdapter?.notifyDataSetChanged()
    }

    override fun displayMessageFavorite() {
        val snackbar = Snackbar
            .make(fragment_meme, "Meme adicionado com sucesso aos favoritos!", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    override fun displayMessageNotFavorite() {
        val snackbar = Snackbar
            .make(fragment_meme, "Meme removido com sucesso aos favoritos!", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    override fun displayShare() {
        val snackbar = Snackbar
            .make(fragment_meme, "Compartilhar o som do meme no!", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    private fun sharedMeme(memeModel: MemeModel){
        ShareSom.shareAudio(this.context!!,memeModel.audio!!)
    }

    private fun playerAudio(memeModel: MemeModel) {
        try {
            val afd: AssetFileDescriptor = context?.assets!!.openFd(memeModel.audio)
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

    override fun onPause() {
        super.onPause()
        if(player != null){
            player!!.stop()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if(player != null){
            player!!.stop()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.menu_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}