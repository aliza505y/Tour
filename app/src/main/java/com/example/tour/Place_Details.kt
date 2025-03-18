package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.tour.databinding.ActivityPlaceDetailsBinding

class Place_Details : AppCompatActivity() {
    lateinit var binding:ActivityPlaceDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlaceDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val create=findViewById<AppCompatButton>(R.id.place_book)
        create.setOnClickListener {
            val intent= Intent(this,Search_Hotel::class.java)
            startActivity(intent)
        }

        val image=intent.getIntExtra("thisImage",0)
        val name=intent.getStringExtra("thisName")
        val starNum=intent.getStringExtra("thisstarNum")
        val location=intent.getStringExtra("thisLocation")
        val dollar=intent.getStringExtra("thisdollar")

        binding.placeImage.setImageResource(image)
        binding.placeName.text=name
        binding.textView2.text=starNum
        binding.placeLocation.text=location
        binding.placeDollar.text=dollar
    }
}