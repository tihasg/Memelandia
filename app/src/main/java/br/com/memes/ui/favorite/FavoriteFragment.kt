package br.com.memes.ui.favorite

import android.content.res.AssetFileDescriptor
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.memes.R
import br.com.memes.model.MemeModel
import br.com.memes.ui.home.MemeAdapter
import br.com.memes.ui.settings.MemesManager
import br.com.memes.utils.ShareSom
import br.com.memes.utils.extensions.setup
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_favorite.*
import java.io.IOException

class FavoriteFragment : Fragment(), FavoriteContract.View {

    private var mPresenter : FavoritePresenter? = null
    private var player : MediaPlayer? = null
    private var memesManager: MemesManager?=null

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
        adapter?.let {rv_meme_favorited.setup(it, layoutManager = GridLayoutManager(context, 3))}
        adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        memesManager= MemesManager(this.context!!)
        mPresenter = FavoritePresenter(this.context!!)
        mPresenter?.attach(this)
        mPresenter?.getListFavorited()
        fragment_favorited.setBackgroundColor(Color.parseColor(memesManager?.color))
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

    private fun sharedMeme(memeModel: MemeModel){
        ShareSom.shareAudio(this.context!!,memeModel.audio!!)
    }

    private fun playerAudio(memeModel: MemeModel) {
        try {
            val afd: AssetFileDescriptor = context?.assets!!.openFd("som/${memeModel.audio}")
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.menu_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}