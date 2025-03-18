package com.example.tour

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.MostVisitedAdapter
import com.example.tour.dataclasses.MostVisited_dataclass

class Most_Visited : AppCompatActivity() {

    private lateinit var mostvisitedArray: ArrayList<MostVisited_dataclass>
    private lateinit var msAdapter: MostVisitedAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_most_visited)


        val msRecyclerView=findViewById<RecyclerView>(R.id.most_visited_recyclerview)
        mostvisitedArray=ArrayList()

        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit1,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit2,"Lake Fond","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit3,"Venice","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit1,"Sajek Valley","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit4,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit5,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit6,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit2,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit3,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit4,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit5,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit1,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit2,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit3,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit4,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit5,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit6,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit1,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit2,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit3,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit4,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))
        mostvisitedArray.add(MostVisited_dataclass(R.drawable.visit5,"Tajhat Jamidarbari","4.8","Bangladesh","$150",))

        val adapter = MostVisitedAdapter(this,mostvisitedArray)
        msRecyclerView.adapter = adapter
         val thislayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
         msRecyclerView.layoutManager = thislayout



    }


}
