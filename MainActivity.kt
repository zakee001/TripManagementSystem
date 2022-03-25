package com.example.login_001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_login = findViewById<Button>(R.id.adminLoginBtn)
        button_login.setOnClickListener{
            val intent_signup = Intent(this, LoginActivity::class.java)
            startActivity(intent_signup)
        }

        val button_C_signUp = findViewById<Button>(R.id.companySignUpBtn)
        button_C_signUp.setOnClickListener{
            val intent_signup = Intent(this, CompanySignUp::class.java)
            startActivity(intent_signup)
        }

        val button_U_signUp = findViewById<Button>(R.id.userSignUpBtn)
        button_U_signUp.setOnClickListener{
            val intent_signup = Intent(this, UserSignUp::class.java)
            startActivity(intent_signup)
        }

        val button_U_login = findViewById<Button>(R.id.userLoginBtn)
        button_U_login.setOnClickListener{
            val intent_signup = Intent(this, UserHome::class.java)
            startActivity(intent_signup)
        }

        val button_C_login = findViewById<Button>(R.id.companyLoginBtn)
        button_C_login.setOnClickListener{
            val intent_signup = Intent(this, CompanyHome::class.java)
            startActivity(intent_signup)
        }
    }
}