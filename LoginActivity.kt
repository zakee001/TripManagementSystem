package com.example.login_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar

        if (actionBar != null) {
            actionBar.title = "Login"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }
}