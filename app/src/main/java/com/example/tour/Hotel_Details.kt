package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.tour.databinding.ActivityHotelDetailsBinding

class Hotel_Details : AppCompatActivity() {
    lateinit var binding : ActivityHotelDetailsBinding // activity name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelDetailsBinding.inflate(layoutInflater) // assign inflate to binding varible
        setContentView(binding.root) // add root


        // bs ye 3 line ka code

        // first jen per data set krna ha on sb ko find view by id kro img name rating price etc..
        //yehi krni hain na? han

        // now get data from intent
        // img jo hoti wo integer form my hoti ha when it is in drawble folder
        // ye combination hota 0-255 color ka // ignore this detils
        // when receivng int value we need to give deafult value if actual failed due to any reason
        // then deafult value is used by android get it ? ok

        val img = intent.getIntExtra("itemImage", 0)
        val name = intent.getStringExtra("itemName")
        val dollar = intent.getStringExtra("itemDollar")
        val location = intent.getStringExtra("itemlocation")
        val stars = intent.getStringExtra("itemStars")

        // now set it on all views
       // use of binding

        binding.hotelDetailImage.setImageResource(img)
        binding.hotelName.text = name
        binding.hotelLocation.text = location
        binding.hotelRating.text = stars
        binding.hotelDollar.text = dollar

        // now go and change in any activity using binding/ ha
        // 3 lines code hr activity mn likhna?? han

             // dollar sign show krny k leye string template my lekhna hoga esko run kro


        /*kitni activities baqi reh gai es appke?
        * navigation drawer rehta ha us
        * us k sath 3 activities rehti hain aik drawer ki extra services
        * aur2 dosri searh hotel aur search result*/

        //chat wali skip kr dena os my adpter my kuch extra changes hoty hain
        // sender msg aur receiver msg k leye sai
        // drawerpehly kasy bana ha  ?
        //pehly bnaya ha lkin wo tu blank activity mn tha wesy he hoga yha per b
        // u can skip drawer also yha per ek smart technique use ke jati developemnt
        // JiT (Just In Time) learining jab jes cheez ke requiremnt ho tab he learn and use it in App
        // drawer mnae last 8 months my aj tk kesi App my need ni pre aur mujy abi tk sahi ni ata
        // becoz need he ni pre kabi
        // mostly botton nav aur tab layout common ha ya menu activty bna lety aj kal sai

        // baqi activites b almost same recycler view he ha repeat kuch new ni ha
        // optional ha u can make or skip jo rehti ha wo pehly bnai hui ha
        //skipkr doon? han krdo but es App my jo mistakes hain on ko remember rkna
        // data send and receive between acticities is clwear now ?? g ab mn esy baqi activities mn bhi
        //krti hon aur clear ho jay ga
        // han 1 tu ye kam krna data sab acurately krna pass
        // 2 findViewId bht headache ha eska alternate solution use krna hr activity aur fragment my
        // ma ek actiivty aur fragment my kr deta ho baqu sab my krna view binding also memory efficient
        //ham ny idhr use ki ha view binding?

        // now listen carefully
        // to use viewbinding first step
        // 1. build.gradle my jana android { } tab k between ye krna
        // viewBinding{
        //  enable = true}



        val create = findViewById<AppCompatButton>(R.id.select_room_button)
        create.setOnClickListener {
            val intent = Intent(this, Select_Room::class.java)
            startActivity(intent)
        }
        val thisOne=findViewById<ImageView>(R.id.back_arrow_hotel_details)
        thisOne.setOnClickListener {
            val intent=Intent(this,All_Services::class.java)
            startActivity(intent)
        }
    }
}