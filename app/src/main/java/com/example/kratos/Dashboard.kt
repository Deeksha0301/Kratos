package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btn1 = findViewById<ImageView>(R.id.imageView56)
        btn1.setOnClickListener {
            val Intent = Intent(this, SleepTracker::class.java)
            startActivity(Intent)
        }

        val btn2 = findViewById<ImageView>(R.id.imageView55)
        btn2.setOnClickListener {
            val Intent = Intent(this, MealStart::class.java)
            startActivity(Intent)
        }

        val btn3 = findViewById<Button>(R.id.button11)
        btn3.setOnClickListener {
            val Intent = Intent(this, ActivityTracker::class.java)
            startActivity(Intent)
        }

        val Btn = findViewById<Button>(R.id.button12)
        Btn.setOnClickListener {
            val Intent = Intent(this, WorkoutDetails2::class.java)
            startActivity(Intent)
        }
        val Btnn = findViewById<Button>(R.id.button10)
        Btnn.setOnClickListener {
            val Intent = Intent(this, graph::class.java)
            startActivity(Intent)
        }
    }
}