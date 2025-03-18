package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forgot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val create = findViewById<Button>(R.id.send_otp_code)
        create.setOnClickListener {
            val intent= Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}