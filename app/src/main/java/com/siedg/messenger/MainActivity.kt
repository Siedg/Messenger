package com.siedg.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = email_edittext_registerscreen.toString()
        val password = password_edittext_registerscreen.toString()


        register_button_registerscreen.setOnClickListener {
            Log.d("MainActivity", "Email: $email")
            Log.d("MainActivity", "Password: $password")
        }

        alreadyhaveaccount_textview_registerscreen.setOnClickListener {
            Log.d("MainActivity", "Try to show login activity")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}