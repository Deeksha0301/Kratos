package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MealStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_start)

        val Button = findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            val Intent = Intent(this, MealPlanner::class.java)
            startActivity(Intent)
        }
        val Button3 = findViewById<ImageView>(R.id.imageButton4)
        Button3.setOnClickListener {
            val Intent = Intent(this, SleepTracker::class.java)
            startActivity(Intent)
        }
        val Btn3 = findViewById<ImageView>(R.id.imageButton3)
        Btn3.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }

    }
}