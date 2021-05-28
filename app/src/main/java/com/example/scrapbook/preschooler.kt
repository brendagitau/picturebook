package com.example.scrapbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class preschooler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preschooler)
        var btnPreschool = findViewById<Button>(R.id.btnPreschool)
        var btnPreschool1 = findViewById<Button>(R.id.btnPreschool1)
        btnPreschool.setOnClickListener {
            var intent = Intent(baseContext, child ::class.java)
            startActivity(intent)
        }
        btnPreschool1.setOnClickListener {
            var intent = Intent(baseContext, toddler ::class.java)
            startActivity(intent)
        }
    }
}