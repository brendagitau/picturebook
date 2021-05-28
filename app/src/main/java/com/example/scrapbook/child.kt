package com.example.scrapbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class child : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        var btnChild = findViewById<Button>(R.id.btnChild)
        var btnChild1 = findViewById<Button>(R.id.btnChild1)
        btnChild.setOnClickListener {
            var intent = Intent(baseContext, end ::class.java)
            startActivity(intent)
        }
        btnChild1.setOnClickListener {
            var intent = Intent(baseContext, preschooler ::class.java)
            startActivity(intent)
        }
    }
}