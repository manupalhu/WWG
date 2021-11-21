package com.example.wwg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCrear = findViewById<Button>(R.id.btnCrear)

        val botonLibro = findViewById<ImageView>(R.id.libro)


        botonCrear.setOnClickListener{

            val intent = Intent(this, CrearPersonaje::class.java)
            startActivity(intent)
        }

        botonLibro.setOnClickListener{

            val intent = Intent(this, HistoriaActivity::class.java)
            startActivity(intent)
        }



    }
}