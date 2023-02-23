package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User

class Register2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        val Btn = findViewById<Button>(R.id.button5)
        val dob = findViewById<TextView>(R.id.dob)
        val wgt = findViewById<TextView>(R.id.weight)
        val hght = findViewById<TextView>(R.id.height)
        Btn.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }
//
//        var database = FirebaseDatabase.getInstance().reference
//
//        Btn.setOnClickListener {
//            var dob = dob.text.toString().toInt()
//            var wgt = wgt.text.toString().toInt()
//            var hght = hght.text.toString().toInt()
//
//            database.child(wgt.toString()).setValue(com.example.kratos.entities.User(dob,wgt,hght))

//        }
    }
}