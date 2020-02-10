package br.com.memes.model

import java.io.Serializable

class MemeModel(val id : String,
                val name : String,
                val audio : String,
                val url : String,
                val img : Int,
                var isFavorite : Boolean) : Serializable