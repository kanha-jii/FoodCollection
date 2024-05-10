package com.example.foodcollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val signupMove =findViewById<TextView>(R.id.sign_tt3)
        val loginButton = findViewById<Button>(R.id.login_bt)

        signupMove.setOnClickListener {
            val intent = Intent(this@LoginPage, MainActivity::class.java)
            startActivity(intent)
        }
        loginButton.setOnClickListener {
            val intent = Intent(this@LoginPage, FoodActivity::class.java)
            startActivity(intent)
        }
    }
}