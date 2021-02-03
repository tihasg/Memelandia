package br.com.memes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.memes.model.MemeModel

@Database(version = 1, entities = arrayOf(MemeModel::class))
abstract class AppDataBase : RoomDatabase() {
    abstract fun memeDao(): MemeDao
}