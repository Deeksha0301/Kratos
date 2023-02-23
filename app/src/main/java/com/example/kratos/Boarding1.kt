package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Boarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding1)

        val Btn = findViewById<Button>(R.id.btn3)
        Btn.setOnClickListener {
            val Intent = Intent(this, Boarding2::class.java)
            startActivity(Intent)
        }
    }
}