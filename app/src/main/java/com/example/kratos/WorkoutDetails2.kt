package com.example.kratos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class WorkoutDetails2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_details2)

        val Btn = findViewById<ImageButton>(R.id.imageView60)
        Btn.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }

        val Btn1 = findViewById<ImageView>(R.id.imageView61)
        Btn1.setOnClickListener {
            val Intent1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CD6BCdFHogg"))
            startActivity(Intent1);
        }



    }
}