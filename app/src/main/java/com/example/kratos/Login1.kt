package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login1 : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

//        val Btn = findViewById<TextView>(R.id.Register)
//        Btn.setOnClickListener {
//            val Intent = Intent(this, Register1::class.java)
//            startActivity(Intent)
//        }

//        auth= FirebaseAuth.getInstance()

        val BtnR = findViewById<TextView>(R.id.Register)
        BtnR.setOnClickListener {
            val intent =Intent(this, Register1::class.java)
            startActivity(intent)
        }

        val BtnL = findViewById<Button>(R.id.Login)
        BtnL.setOnClickListener {
            val intent =Intent(this, Dashboard::class.java)
            startActivity(intent)
        }


//        val EmailID = findViewById<TextView>(R.id.Email)
//        val Passw = findViewById<TextView>(R.id.Passw)
       
//        BtnL.setOnClickListener {
//            if(checking()){
//                val email= EmailID.text.toString()
//                val password= Passw.text.toString()
//                auth.signInWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            Toast.makeText(this, "LoggedIn", Toast.LENGTH_LONG).show()
//                            finish()
//                        } else {
//                            Toast.makeText(this, "Wrong Details", Toast.LENGTH_LONG).show()
//                        }
//                    }
//            }
//            else{
//                Toast.makeText(this,"Enter the Details",Toast.LENGTH_LONG).show()
//            }
//        }
//    }
//    private fun checking():Boolean
//    {
//        val emailid = findViewById<TextView>(R.id.emailid)
//        val passwa = findViewById<TextView>(R.id.Passw)
//
//        if(emailid.text.toString().trim{it<=' '}.isNotEmpty()
//            && passwa.text.toString().trim{it<=' '}.isNotEmpty())
//        {
//            return true
//        }
//        return false
    }
}