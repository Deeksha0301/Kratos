package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btn = findViewById<Button>(R.id.button1)
        Btn.setOnClickListener {
            val Intent = Intent(this, Boarding1::class.java)
            startActivity(Intent)
        }
    }
}