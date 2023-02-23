package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SleepSchedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_schedule)

        val Button7 = findViewById<ImageView>(R.id.imageView31)
        Button7.setOnClickListener {
            val Intent = Intent(this, SleepTracker::class.java)
            startActivity(Intent)
        }
    }
}