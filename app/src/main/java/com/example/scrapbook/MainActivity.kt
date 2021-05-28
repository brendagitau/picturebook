package com.example.scrapbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnInfant = findViewById<Button>(R.id.btnInfant)
        btnInfant.setOnClickListener {
            var intent = Intent(baseContext, toddler::class.java)
            startActivity(intent)
    }
}}
