package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnpre2:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnpre2=findViewById(R.id.btnpre2)
        btnpre2.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnnext2=findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

    }
}