package br.com.memes.data

import androidx.room.*
import br.com.memes.model.MemeModel

@Dao
interface MemeDao {

    @Query("SELECT * FROM meme") fun getAllMemes(): List<MemeModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE) fun insertMeme(vararg meme: MemeModel)

    @Update fun updateMeme(memeModel: MemeModel)

    @Query("SELECT * FROM meme WHERE isFavorite = :favorited ")
    fun loadMemeFavorited(favorited : Boolean) : List<MemeModel>
}