package com.example.wwg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CrearPersonaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_personaje)

        val botonVolver = findViewById<Button>(R.id.btnVolverPersonaje)
        botonVolver.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}