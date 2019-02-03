package com.example.abril.la4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Pagina1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1)

        val pagina = findViewById<WebView>(R.id.Pagina1)
        pagina.loadUrl("https://github.com/AbrilPal/labmovil")
    }
}
