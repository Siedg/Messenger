package com.siedg.messenger.registerlogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.siedg.messenger.R
import com.siedg.messenger.messages.LastestMessagesActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button_loginscreen.setOnClickListener {
            val email = email_edittext_loginscreen.text.toString()
            val password = password_edittext_loginscreen.text.toString()
            Log.d("LoginActivity", "Email: $email \nPassword: $password \n\n")
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    val intent = Intent(this, LastestMessagesActivity::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener {}
        }



    }
}
