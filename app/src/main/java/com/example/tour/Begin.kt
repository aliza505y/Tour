package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Begin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin)

        val create= findViewById<Button>(R.id.let_begin_button)
        create.setOnClickListener {
            val intent= Intent(this,HomePage::class.java)
            startActivity(intent)
        }
    }
}