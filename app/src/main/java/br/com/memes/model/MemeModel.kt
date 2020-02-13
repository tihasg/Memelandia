package br.com.memes.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "meme")

class MemeModel(@PrimaryKey val id : String,
                val name : String,
                val audio : String,
                val url : String,
                val img : String,
                var isFavorite : Boolean) : Serializable