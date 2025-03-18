package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Reset : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)

        val create=findViewById<Button>(R.id.submit_button)
        create.setOnClickListener {
            val intent= Intent(this,Forgot::class.java)
            startActivity(intent)
        }
    }
}