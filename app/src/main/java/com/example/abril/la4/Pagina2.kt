package com.example.abril.la4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Pagina2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)

        val pagina = findViewById<WebView>(R.id.Pagina2)
        pagina.loadUrl("https://github.com/AbrilPal/Lab3M")
    }
}
