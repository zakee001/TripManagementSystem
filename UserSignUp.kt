package com.example.login_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_sign_up)

        val actionBar = supportActionBar

        actionBar!!.title = "Sign Up"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}