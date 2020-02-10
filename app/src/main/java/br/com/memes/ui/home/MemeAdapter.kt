package br.com.memes.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.memes.R
import br.com.memes.model.MemeModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_meme.view.*

class MemeAdapter(private val context: Context, private val onItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list: ArrayList<MemeModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_meme, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ItemViewHolder){
            holder.bind(list[position], onItemClickListener)
        }
    }

    fun setMeme(listMemes: List<MemeModel>){
        list.addAll(listMemes)
    }

    interface OnItemClickListener{
        fun onItemClicked( item : MemeModel )
    }

    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(item : MemeModel, onItemClickListerner: OnItemClickListener){

            itemView.apply {
                setOnClickListener {
                    onItemClickListerner.onItemClicked( item )
                }

                Picasso.get().load(item.img).into(img_meme)

            }
        }
    }


}