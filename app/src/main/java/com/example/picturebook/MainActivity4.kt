package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var btnpre4:Button
    lateinit var btnnext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btnpre4=findViewById(R.id.btnpre4)
        btnpre4.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        btnnext4=findViewById(R.id.btnnext4)
        btnnext4.setOnClickListener {
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }

    }
}

