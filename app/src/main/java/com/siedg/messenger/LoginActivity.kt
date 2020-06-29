package com.siedg.messenger

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LoginActivity", "=====")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = email_edittext_loginscreen.text.toString()
        val password = password_edittext_loginscreen.text.toString()

       // FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            //.addOnCompleteListener {}
            //.addOnFailureListener {}
    }
}