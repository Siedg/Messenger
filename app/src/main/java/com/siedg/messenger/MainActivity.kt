package com.siedg.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        register_button_registerscreen.setOnClickListener {
            val email = email_edittext_registerscreen.text.toString()
            val password = password_edittext_registerscreen.text.toString()
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
        }

        alreadyhaveaccount_textview_registerscreen.setOnClickListener {
            Log.d("MainActivity", "Try to show login activity")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}