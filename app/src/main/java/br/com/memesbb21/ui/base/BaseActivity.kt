package br.com.memesbb21.ui.base

import android.content.Context
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.com.memesbb21.R

abstract class BaseActivity : AppCompatActivity() {

    protected val TAG = if (javaClass.enclosingClass != null) javaClass.enclosingClass!!.simpleName else javaClass.simpleName

    val context: Context
        get() = this

    //MENU METHODS
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_settings -> {
                return true
            }
            R.id.action_search -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}