package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView

class Splash : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@Splash, OnBoarding1::class.java))
        }, 2000)

        // splash screen represents App logo etc.. it should automatically redirect
        // to next screen after some seconds of delay
        // here handler class is used to do this 2000 miliseconds mean 2 second sai
     //ye box k mid mn kion nai lika jarra
     // it called itp view es k leye library use krna prti ha

        // ai k leye asy he use kr lo baad my dkehy gy library little bit complex ha use ok
    }
}