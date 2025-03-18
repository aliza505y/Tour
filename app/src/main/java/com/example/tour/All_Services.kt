package com.example.tour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.AllServicesAdapter
import com.example.tour.Adapters.MoreServicesAdapter
import com.example.tour.databinding.ActivityAllServicesBinding
import com.example.tour.dataclasses.AllServices_dataclass
import com.example.tour.dataclasses.MoreServices_dataclass

class All_Services : AppCompatActivity() {

    private lateinit var allServicesArrayList: ArrayList<AllServices_dataclass>
    private lateinit var allServicesAdapter: AllServicesAdapter

    private lateinit var moreServicesArrayList: ArrayList<MoreServices_dataclass>
    private lateinit var moreServicesAdapter: MoreServicesAdapter
    lateinit var binding: ActivityAllServicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // es my kro adapter mn pehly changes krna pry gi?  ni ni asa kuch ni activity my krna bs


        allServicesArrayList = ArrayList()

        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Hotel"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.flight, "Flight"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.bus, "Bus"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Boat"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Hotel"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.flight, "Flight"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.bus, "Bus"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Boat"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Hotel"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.flight, "Flight"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.bus, "Bus"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Boat"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Hotel"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.flight, "Flight"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.bus, "Bus"))
        allServicesArrayList.add(AllServices_dataclass(R.drawable.boat, "Boat"))

        val adapter = AllServicesAdapter(allServicesArrayList)
        binding.allServicesRecyclerview.adapter = adapter
        val viewws = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.allServicesRecyclerview.layoutManager = (viewws)

        // simple to use ha binding lekh k agy jo XML id ha wo baqi sb same hoga

        moreServicesArrayList = ArrayList()

        /*baqi recyclerviews my b i think ye issue hoga mn dynamic likhy thy lakin wo run nai hua sai sy phir dobara mn ny sara dat
        * likh dia shaid kahi mistake ho gai ho gi*/

        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r1,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r2,
                "Dream Valley",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r3,
                "Esha Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r4,
                "Luxury Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r1,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r2,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r3,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r4,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r1,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )
        moreServicesArrayList.add(
            MoreServices_dataclass(
                R.drawable.r2,
                "Holy Park Hotel",
                "4.8",
                "Cox's Bazar",
                "$89",
                "/Room/Night",
            )
        )

// koi ni yha recycker view  he krna tha bs ok binding ko different jaga py use kia jata ha?
        // different mean ? udher data fet krny k liay use kia
        // ye har os jga per use hogi jaha findviewby id kea jata ha es sy bar bar find view by id nhi krna parta
        // ek bar activity my binding add krlo then use all ids xml direcl shity
       // ye adapter my use hoti ha fragment my b acctivity my b ohk
        // for now its enough baqi activities my b change kr lena jo required ha binding and datapassing
        //sai anything else related to ask ?? nothing oky
        // change jere yahan py konsa data get krna
        val adapterr = MoreServicesAdapter(this, moreServicesArrayList)
        binding.moreServicesRecyclerView.adapter = adapterr
        val servicess = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.moreServicesRecyclerView.layoutManager = servicess


    }
}