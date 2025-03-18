package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class
SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val create= findViewById<AppCompatButton>(R.id.appCompatButton_sendrotp)
        create.setOnClickListener {
            val intent=Intent(this,Begin::class.java)
            startActivity(intent)
        }
    }
}