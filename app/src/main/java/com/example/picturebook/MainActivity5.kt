package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnpre5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btnpre5 = findViewById(R.id.btnpre5)
        btnpre5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
        btnpre5 = findViewById(R.id.btnpre5)
        btnpre5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}
