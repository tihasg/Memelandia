package br.com.memes

import android.app.Application
import androidx.room.Room
import br.com.memes.data.AppDataBase

open class MyApplication : Application() {

    companion object {
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, AppDataBase::class.java, "meme-db").allowMainThreadQueries().build()
    }

}