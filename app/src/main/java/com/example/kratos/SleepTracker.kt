package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class SleepTracker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_tracker)

        val Button8 = findViewById<Button>(R.id.button8)
        Button8.setOnClickListener {
            val Intent = Intent(this, SleepSchedule::class.java)
            startActivity(Intent)
        }

        val Button9 = findViewById<ImageView>(R.id.imageView27)
        Button9.setOnClickListener {
            val Intent = Intent(this, MealStart::class.java)
            startActivity(Intent)
        }


        val btn = findViewById<ImageView>(R.id.imageButton)
        btn.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }
    }
}