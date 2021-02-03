package br.com.memesbb21.ui.home

import android.content.res.AssetFileDescriptor
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.memesbb21.R
import br.com.memesbb21.model.MemeModel
import br.com.memesbb21.ui.settings.MemesManager
import br.com.memesbb21.utils.ShareSom
import br.com.memesbb21.utils.extensions.setup
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.IOException

class HomeFragment : Fragment(), HomeContract.View {

    private var mPresenter : HomePresenter? = null
    private var player : MediaPlayer? = null
    private var memesManager: MemesManager?=null
    private lateinit var mMenu : Menu

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
        setListeners()
    }

    private fun setListeners(){
        searchView.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mPresenter?.searchMeme(s.toString())
            }

        })
    }

    private fun setup() {
        memesManager= MemesManager(this.context!!)
        mPresenter = HomePresenter(this.context!!)
        mPresenter?.attach(this)
        mPresenter?.getList()
        fragment_meme.setBackgroundColor(Color.parseColor(memesManager?.color))
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
        inflater.inflate(R.menu.menu_home, menu)
        mMenu = menu
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_search -> { setVisibleSearch() }
        }

        when (item.itemId){
            R.id.action_cancel_search -> { cancelSearch() }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun cancelSearch(){
        searchView.text.clear()
        searchView.visibility = View.GONE

        mMenu.findItem(R.id.action_cancel_search).isVisible = false
        mMenu.findItem(R.id.action_search).isVisible = true
    }

    private fun setVisibleSearch(){
        if(searchView.isVisible){

            mMenu.findItem(R.id.action_cancel_search).isVisible = false
            mMenu.findItem(R.id.action_search).isVisible = true

            searchView.visibility = View.GONE
        } else {

            mMenu.findItem(R.id.action_search).isVisible = false
            mMenu.findItem(R.id.action_cancel_search).isVisible = true

            mPresenter?.getList()
            searchView.visibility = View.VISIBLE
        }
    }

}