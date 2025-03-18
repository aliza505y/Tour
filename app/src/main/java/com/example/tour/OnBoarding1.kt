package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val creation=findViewById<TextView>(R.id.skip_1)
        creation.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }

        val create = findViewById<ImageView>(R.id.circle_1)
        create.setOnClickListener {
            val intent=Intent(this,OnBoarding2::class.java)
            startActivity(intent)
        }

    }
}