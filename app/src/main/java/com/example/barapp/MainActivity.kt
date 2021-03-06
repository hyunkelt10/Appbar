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




        val actionBar = supportActionBar
        actionBar!!.title = "    Sing up"

        actionBar.setIcon(R.drawable.ic_atras)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setHomeButtonEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true) // para que el home sea una flecha

        b.btRegister.setOnClickListener { val myintent = Intent (this, Result_activity::class.java)
        startActivity(myintent)}


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return true


    }



    }


//        return super.onOptionsItemSelected(item)

