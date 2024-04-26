package com.example.greenaward

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            findViewById<ImageButton>(R.id.open_mappa).setOnClickListener{

                setContentView(R.layout.activity_diario)
            }
        }
    }


    //funzione associata al botton per aprire la pimpa
    /*fun openPimpa(view: View) {
        val intent = Intent(this, Diario::class.java)
        startActivity(intent)
    }*/
