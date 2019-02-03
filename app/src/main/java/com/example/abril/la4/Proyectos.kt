package com.example.abril.la4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Proyectos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyectos)

        val proyecto1 = findViewById<Button>(R.id.button)
        proyecto1.setOnClickListener {
            val intent = Intent(this,Pagina1::class.java)
            startActivity(intent)
        }

        val proyecto2 = findViewById<Button>(R.id.button2)
        proyecto2.setOnClickListener {
            val intent = Intent(this,Pagina2::class.java)
            startActivity(intent)
        }
    }
}
