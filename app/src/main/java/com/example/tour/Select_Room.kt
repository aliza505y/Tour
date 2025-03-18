package com.example.tour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.SelectRoomAdapter
import com.example.tour.dataclasses.SelectRoom_dataclass

class Select_Room : AppCompatActivity() {

    private lateinit var selectRoomArray:ArrayList<SelectRoom_dataclass>
    private lateinit var selectRoomAdapter: SelectRoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_room)

        val srRecyclerView=findViewById<RecyclerView>(R.id.select_room_recycler_view)
        selectRoomArray=ArrayList()

        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))
        selectRoomArray.add(SelectRoom_dataclass(R.drawable.room_image,"Deluxe Double Bed With Balcony",R.drawable.roooom,"01 Room",R.drawable.user,"02 Guests",R.drawable.nooosmooking,"Non-Smooking Room","$85","For 01 Night/Room","View More Details>",))

        val adapter=SelectRoomAdapter(selectRoomArray)
        srRecyclerView.adapter=adapter
        val layout=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        srRecyclerView.layoutManager=(layout)

        val create=findViewById<ImageView>(R.id.back_arrow_select_room)
        create.setOnClickListener {
            val intent= Intent(this,Hotel_Details::class.java)
            startActivity(intent)
        }
    }
}