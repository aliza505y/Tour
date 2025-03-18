package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class OnBoarding2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val create=findViewById<ImageView>(R.id.circle_2)
        create.setOnClickListener {
            val intent= Intent(this,OnBoarding3::class.java)
            startActivity(intent)
        }

        val sign=findViewById<TextView>(R.id.skip_2)
        sign.setOnClickListener {
            val integer=Intent(this,Login::class.java)
            startActivity(integer)
        }
    }
}