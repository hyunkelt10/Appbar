package com.example.barapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NavUtils
import com.example.barapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    companion object {
        var ID_OPT1 = Menu.FIRST
        var ID_OPTION2 = Menu.FIRST + 1

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        registerForContextMenu(b.textView)


        val actionBar = supportActionBar
        actionBar!!.title = "                actionBar"
        actionBar!!.subtitle = "             subtitulo"
        actionBar.setIcon(R.drawable.icon_flash_head_100)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setHomeButtonEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true) // para que el home sea una flecha


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true


    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) { super.onCreateContextMenu(menu, v, menuInfo)
        if (v?.id== R.id.textView) {
            menu?.setHeaderTitle("menu contextual")
            menu?.add(0, ID_OPT1, Menu.NONE, "opt 1")
                ?.setIcon(R.drawable.ic_dragon)
            menu?.add(0, ID_OPTION2, Menu.NONE, "opcion 2")
                ?.isCheckable = true


        }

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        super.onContextItemSelected(item)
        when(item.itemId){
            ID_OPT1 -> {
                Toast.makeText(this,"has pulsado menu contextual 1", Toast.LENGTH_SHORT).show()
                return true
            }
            ID_OPTION2 -> {
                Toast.makeText(this,"has pulsado menu contextual 2", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        return false
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

//        val id : Int = item.getItemId()
//        if (id == androidx.appcompat.R.id.home) {
//            NavUtils.navigateUpTo (this, Intent (this,MainActivity::class.java))
//        }

        if (item.itemId == R.id.it1) {
            Toast.makeText(this, "has pulsado buscar", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.it2) {
            Toast.makeText(this, "has pulsado elemento 2", Toast.LENGTH_SHORT).show()
        }
        else if (item.itemId == R.id.it3) {
            Toast.makeText(this, "has pulsado elemento 3", Toast.LENGTH_SHORT).show()
        }


        return true
    }
//        return super.onOptionsItemSelected(item)
}
