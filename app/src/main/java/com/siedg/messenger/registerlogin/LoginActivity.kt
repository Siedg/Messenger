package com.siedg.messenger.registerlogin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.siedg.messenger.R
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

asdasdas