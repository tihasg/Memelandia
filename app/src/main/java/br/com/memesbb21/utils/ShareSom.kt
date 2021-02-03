package br.com.memesbb21.utils

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream

object ShareSom {
    fun shareAudio(
        activity: Context,
        fileName: String?
    ) {
        val f = File(activity.filesDir, fileName)
        if (!f.exists()) {
            val assets = activity.assets
            try {
                copy(assets.open(fileName!!), f)
            } catch (e: IOException) {
                Log.e("FileProvider", "Exception copying from assets", e)
                return
            }
        }
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        sharingIntent.type = "audio/mp3"
        sharingIntent.putExtra(
            Intent.EXTRA_STREAM,
            FileProvider.getUriForFile(activity, activity.packageName, f)
        )
        activity.startActivity(Intent.createChooser(sharingIntent, "Compartilhar o som do meme no"))
    }

    @Throws(IOException::class)
    private fun copy(`in`: InputStream, dst: File) {
        val out = FileOutputStream(dst)
        val buf = ByteArray(`in`.available())
        var len: Int
        while (`in`.read(buf).also { len = it } > 0) {
            out.write(buf, 0, len)
        }
        `in`.close()
        out.close()
    }
}