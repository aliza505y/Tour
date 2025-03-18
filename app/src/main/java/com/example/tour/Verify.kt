package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val create= findViewById<Button>(R.id.verify_button)
        create.setOnClickListener {
            val intent= Intent(this,Reset::class.java)
            startActivity(intent)
        }
    }
}