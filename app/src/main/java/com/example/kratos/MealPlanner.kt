package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MealPlanner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_planner)

        val Button4 = findViewById<ImageButton>(R.id.imageView9)
        Button4.setOnClickListener {
            val Intent = Intent(this, MealStart::class.java)
            startActivity(Intent)
        }

        val Button5 = findViewById<Button>(R.id.button4)
        Button5.setOnClickListener {
            val Intent = Intent(this, MealDetails::class.java)
            startActivity(Intent)
        }
    }

}