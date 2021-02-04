package br.com.memesbb21

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.memesbb21.ui.settings.MemesManager
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {
    private val MY_PERMISSION_RQUEST_STORAGE = 1
    private lateinit var appBarConfiguration: AppBarConfiguration
    private var memesManager: MemesManager? = null
    var navController: NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        memesManager = MemesManager(this)
        setSupportActionBar(toolbar)

        setupPermissions()
        setColor()

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)

        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.nav_home, R.id.nav_fav, R.id.nav_setings), drawerLayout
        )
        setupActionBarWithNavController(navController!!, appBarConfiguration)
        navView.setupWithNavController(navController!!)
    }

    private fun setupPermissions() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                    MY_PERMISSION_RQUEST_STORAGE
                )
            } else {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                    MY_PERMISSION_RQUEST_STORAGE
                )
            }
        }
    }

    fun setColor(){
        navView = findViewById(R.id.nav_view)
        tooBar = findViewById(R.id.toolbar)
        tooBar!!.setBackgroundColor(Color.parseColor(memesManager?.color))
        navView!!.setBackgroundColor(Color.parseColor(memesManager?.color))
        if (Build.VERSION.SDK_INT >= 21) {
            val window = (this as Activity?)!!.window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = getDarkColor(Color.parseColor(memesManager?.color))
        }
    }

    fun getDarkColor(color: Int): Int {
        var darkColor = 0
        val r = Math.max(Color.red(color) - 25, 0)
        val g = Math.max(Color.green(color) - 25, 0)
        val b = Math.max(Color.blue(color) - 25, 0)
        darkColor = Color.rgb(r, g, b)
        return darkColor
    }
    
    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        when (item?.itemId) {
            R.id.action_settings -> {
                navController?.navigate(R.id.nav_setings)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onResume() {
        super.onResume()
        setColor()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    companion object{
        var navView : NavigationView?=null
        var tooBar: Toolbar?=null
    }


}
