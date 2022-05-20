package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btnpre3:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnpre3=findViewById(R.id.btnpre3)
        btnpre3.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        btn3=findViewById(R.id.btn3)
        btn3.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

    }
}