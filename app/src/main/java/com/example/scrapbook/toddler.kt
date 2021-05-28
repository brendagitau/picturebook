package com.example.scrapbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class toddler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toddler2)
        var btnToddler = findViewById<Button>(R.id.btnToddler)
        var btnToddler1 = findViewById<Button>(R.id.btnToddler1)
        btnToddler.setOnClickListener {
            var intent = Intent(baseContext, preschooler::class.java)
            startActivity(intent)
        }
        btnToddler1.setOnClickListener {
            var intent = Intent(baseContext, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}