package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class Register1 : AppCompatActivity() {


    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)

//        val Btn = findViewById<Button>(R.id.Next)
//        Btn.setOnClickListener {
//            val Intent = Intent(this, Register2::class.java)
//            startActivity(Intent)
//        }

        val Btn1 = findViewById<TextView>(R.id.textView4)
        Btn1.setOnClickListener {
            val Intent = Intent(this, Login1::class.java)
            startActivity(Intent)
        }

        auth= FirebaseAuth.getInstance()
        db= FirebaseFirestore.getInstance()

        val Btn = findViewById<Button>(R.id.Next)
        val Emailid = findViewById<TextView>(R.id.emailid)
        val PassWa = findViewById<TextView>(R.id.Passw)
        val NAme = findViewById<TextView>(R.id.nameid)
        val PhonE = findViewById<TextView>(R.id.phoneno)

        Btn.setOnClickListener {
            if(checking())
            {
                var email= Emailid.text.toString()
                var password= PassWa.text.toString()
                var name=NAme.text.toString()
                var phone=PhonE.text.toString()
                val user= hashMapOf(
                    "Name" to name,
                    "Phone" to phone,
                    "email" to email
                )
                val Users=db.collection("USERS")
                val query =Users.whereEqualTo("email",email).get()
                    .addOnSuccessListener {
                            tasks->
                        if(tasks.isEmpty)
                        {
                            auth.createUserWithEmailAndPassword(email,password)
                                .addOnCompleteListener(this){
                                        task->
                                    if(task.isSuccessful)
                                    {
                                        Users.document(email).set(user)
                                        val intent = Intent(this, Register2::class.java).also {
                                            it.putExtra("email",email)
                                            startActivity(it)
                                        }
                                        finish()
                                    }
                                    else
                                    {
                                        Toast.makeText(this,"Authentication Failed", Toast.LENGTH_LONG).show()
                                    }
                                }
                        }
                        else
                        {
                            Toast.makeText(this,"User Already Registered", Toast.LENGTH_LONG).show()
                            val intent= Intent(this,MainActivity::class.java)
                            startActivity(intent)
                        }
                    }
            }
            else{
                Toast.makeText(this,"Enter the Details", Toast.LENGTH_LONG).show()
            }
        }
    }


    private fun checking():Boolean{

        val emailId = findViewById<TextView>(R.id.emailid)
        val passW = findViewById<TextView>(R.id.Passw)
        val nameId = findViewById<TextView>(R.id.nameid)
        val phoneN = findViewById<TextView>(R.id.phoneno)

        if(nameId.text.toString().trim{it<=' '}.isNotEmpty()
            && phoneN.text.toString().trim{it<=' '}.isNotEmpty()
            && emailId.text.toString().trim{it<=' '}.isNotEmpty()
            && passW.text.toString().trim{it<=' '}.isNotEmpty()
        )
        {
            return true
        }
        return false
    }
}