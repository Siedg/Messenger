package com.siedg.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register_button_registerscreen.setOnClickListener {
            performRegister()
        }

        alreadyhaveaccount_textview_registerscreen.setOnClickListener {
            Log.d("MainActivity", "Try to show login activity")
            val intent = Intent(this, LoginActivity::class.java)
            Toast.makeText(this, "Started LoginActivity", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        selectphoto_button_registerscreen.setOnClickListener {
            Log.d("MainActivity", "Try to show the photo selector")
        }
    }

    private fun performRegister() {
        val email = email_edittext_registerscreen.text.toString()
        val password = password_edittext_registerscreen.text.toString()

        if (email.isEmpty()) {
            Toast.makeText(this, "Invalid email", Toast.LENGTH_SHORT).show()
            return
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Invalid password", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d("MainActivity", "Email: $email")
        Log.d("MainActivity", "Password: $password")

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener
                Log.d(
                    "MainActivity",
                    "Successfully created user with uid: ${it.result!!.user!!.uid}"
                )
            }
            .addOnFailureListener {
                Log.d("MainActivity", "Failed to create user: ${it.message}")
                Toast.makeText(this, "Failed to create user: ${it.message}", Toast.LENGTH_SHORT).show()
            }
    }
}