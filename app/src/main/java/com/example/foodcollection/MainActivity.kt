package com.example.foodcollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val move = findViewById<TextView>(R.id.move_log)
        move.setOnClickListener {
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }
    }
}