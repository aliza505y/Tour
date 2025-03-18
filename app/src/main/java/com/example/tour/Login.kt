package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Login : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val create=findViewById<AppCompatButton>(R.id.appCompatButton)
        create.setOnClickListener {
            val intent = Intent(this,Verify::class.java)
            startActivity(intent)
        }

        val createion=findViewById<ImageView>(R.id.back_arrow_login)
        createion.setOnClickListener {
            val intent=Intent(this,OnBoarding3::class.java)
            startActivity(intent)
        }
    }

}