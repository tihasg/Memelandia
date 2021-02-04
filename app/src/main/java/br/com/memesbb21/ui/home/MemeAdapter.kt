package br.com.memesbb21.ui.home

import android.content.Context
import android.content.res.AssetManager
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.memesbb21.R
import br.com.memesbb21.model.MemeModel
import kotlinx.android.synthetic.main.item_meme.view.*
import java.io.IOException
import java.io.InputStream


class MemeAdapter(
    private val context: Context,
    private val onItemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list: List<MemeModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_meme, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.bind(list[position], onItemClickListener)
        }
    }

    fun setMeme(listMemes: List<MemeModel>) {
        list = listMemes
    }

    interface OnItemClickListener {
        fun onItemClicked(item: MemeModel)
        fun onShareClicked(item: MemeModel)
        fun onFavoriteClicked(item: MemeModel)
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: MemeModel, onItemClickListerner: OnItemClickListener) {

            itemView.apply {
                play.setOnClickListener {
                    onItemClickListerner.onItemClicked(item)
                }

                img_shared.setOnClickListener {
                    onItemClickListerner.onShareClicked(item)
                }

                img_favorite.setOnClickListener {
                    onItemClickListerner.onFavoriteClicked(item)
                }

                if (item.isFavorite) {
                    img_favorite.setImageDrawable(context.getDrawable(R.drawable.ic_favorite_red))
                } else {
                    img_favorite.setImageDrawable(context.getDrawable(R.drawable.ic_favorite))
                }
                tv_title.text = item.name
                val assetManager: AssetManager = context.assets
                try {
                    val ims: InputStream = assetManager.open(item.img)
                    val d =
                        Drawable.createFromStream(ims, null)
                    img_meme.setImageDrawable(d)
                } catch (ex: IOException) {
                    return
                }
            }
        }

    }


}