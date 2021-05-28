package com.example.scrapbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class end : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        var btnEnd = findViewById<Button>(R.id.btnEnd)
        btnEnd.setOnClickListener {
            var intent = Intent(baseContext, child ::class.java)
            startActivity(intent)
        }
    }
}