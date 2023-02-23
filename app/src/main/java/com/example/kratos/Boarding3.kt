package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Boarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding3)

        val Btn = findViewById<Button>(R.id.btn2)
        Btn.setOnClickListener {
            val Intent = Intent(this, Boarding4::class.java)
            startActivity(Intent)
        }
    }
}