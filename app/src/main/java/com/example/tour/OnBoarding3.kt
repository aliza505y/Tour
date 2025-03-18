package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val create = findViewById<ImageView>(R.id.circle_3)
        create.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }

        val view=findViewById<TextView>(R.id.skip_3)
        view.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}