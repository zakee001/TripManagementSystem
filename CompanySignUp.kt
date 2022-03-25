package com.example.login_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CompanySignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_sign_up)

        val actionBar = supportActionBar

        actionBar!!.title = "Sign Up"
        actionBar.setDisplayHomeAsUpEnabled(true)


    }
}