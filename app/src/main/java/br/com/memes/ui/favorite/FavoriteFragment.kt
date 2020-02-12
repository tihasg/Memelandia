package br.com.memes.ui.favorite

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.memes.R
import br.com.memes.extensions.setup
import br.com.memes.model.MemeModel
import br.com.memes.ui.home.MemeAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_gallery.*
import java.io.IOException

class FavoriteFragment : Fragment(), FavoriteContract.View {

    private var mPresenter : FavoritePresenter? = null
    private var player : MediaPlayer? = null

    private val mAdapter by lazy {
        val adapter = context?.let {
            MemeAdapter(it, object : MemeAdapter.OnItemClickListener{
                override fun onItemClicked(item: MemeModel) {
                    playerAudio(item)
                }

                override fun onShareClicked(item: MemeModel) {
                }

                override fun onFavoriteClicked(item: MemeModel) {
                    mPresenter?.favoriteMeme(item)
                }
            })
        }
        adapter?.let {rv_meme_favorited.setup(it, layoutManager = GridLayoutManager(context, 3))}
        adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        mPresenter = FavoritePresenter(this.context!!)
        mPresenter?.attach(this)
        mPresenter?.getListFavorited()
    }

    override fun displayError(msg: String?) {

    }

    override fun showLoading(loading: Boolean) {
    }

    override fun setList(list: List<MemeModel>) {
        mAdapter?.setMeme(list)
        mAdapter?.notifyDataSetChanged()
    }

    override fun initList() {
        mPresenter?.getListFavorited()
    }

    override fun displayMessageNotFavorite() {
        val snackbar = Snackbar
            .make(fragment_favorited, "Meme removido com sucesso aos favoritos!", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    override fun onPause() {
        super.onPause()
        if(player != null){
            player!!.stop()
        }
    }

    private fun playerAudio(memeModel: MemeModel) {
        try {
            val afd: AssetFileDescriptor = context?.assets!!.openFd("audio/${memeModel.audio}")
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

    override fun onDestroy() {
        super.onDestroy()
        if(player != null){
            player!!.stop()
        }

    }

}