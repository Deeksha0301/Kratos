package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Boarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding2)

        val Btn = findViewById<Button>(R.id.btn)
        Btn.setOnClickListener {
            val Intent = Intent(this, Boarding3::class.java)
            startActivity(Intent)
        }
    }
}