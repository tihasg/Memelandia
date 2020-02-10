package br.com.memes.ui.home

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
import kotlinx.android.synthetic.main.fragment_home.*
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
                    mPresenter?.sharedMeme(item)
                }

                override fun onFavoriteClicked(item: MemeModel) {
                    mPresenter?.favoriteMeme(item)
                }
            })
        }
        adapter?.let {
            rv_meme.setup(it, layoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL))
        }
        adapter
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
}