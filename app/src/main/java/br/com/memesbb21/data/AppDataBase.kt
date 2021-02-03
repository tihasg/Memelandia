package br.com.memesbb21.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.memesbb21.model.MemeModel

@Database(version = 1, entities = arrayOf(MemeModel::class))
abstract class AppDataBase : RoomDatabase() {
    abstract fun memeDao(): MemeDao
}