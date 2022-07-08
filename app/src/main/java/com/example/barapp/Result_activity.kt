package com.example.barapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.barapp.databinding.ActivityMainBinding
import com.example.barapp.databinding.ActivityResultBinding

class Result_activity : AppCompatActivity() {
    private lateinit var b: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityResultBinding.inflate(layoutInflater)
        setContentView(b.root)

        val actionBar = supportActionBar
        actionBar!!.title = "  "

        actionBar.setIcon(R.drawable.ic_atras)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setHomeButtonEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true) // para que el home sea una flecha




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu2, menu)
        return true


    }



}


//        return super.onOptionsItemSelected(item)












