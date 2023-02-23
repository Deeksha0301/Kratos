package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Boarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding4)

        val Btn = findViewById<Button>(R.id.btn4)
        Btn.setOnClickListener {
            val Intent = Intent(this, Register1::class.java)
            startActivity(Intent)
        }
    }
}