package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MealDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_details)

        val Button1 = findViewById<TextView>(R.id.textView18)
        Button1.setOnClickListener {
            val Intent = Intent(this, PancakeRecipe::class.java)
            startActivity(Intent)
        }
        val Button2 = findViewById<ImageView>(R.id.imageView9)
        Button2.setOnClickListener {
            val Intent = Intent(this, MealPlanner::class.java)
            startActivity(Intent)
        }
    }
}