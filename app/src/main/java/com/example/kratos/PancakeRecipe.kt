package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PancakeRecipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pancake_recipe)

        val Button6 = findViewById<ImageView>(R.id.imageView25)
        Button6.setOnClickListener {
            val Intent = Intent(this, MealDetails::class.java)
            startActivity(Intent)
        }
    }
}