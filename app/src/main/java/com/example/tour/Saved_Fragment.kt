package com.example.tour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.SavedAdapter
import com.example.tour.Adapters.SavedEventAdapter
import com.example.tour.dataclasses.Saved_Event_dataclass
import com.example.tour.dataclasses.Saved_dataclass

class Saved_Fragment : Fragment() {

    private lateinit var savedArrayList:ArrayList<Saved_dataclass>
    private lateinit var Adapter: SavedAdapter

    private lateinit var eventArrayList:ArrayList<Saved_Event_dataclass>
    private lateinit var eventAdapter:SavedEventAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val watch= inflater.inflate(R.layout.fragment_saved_fragment, container, false)

        val saveRecyclerView=watch.findViewById<RecyclerView>(R.id.places_recyclerview)
        savedArrayList=ArrayList()
        savedArrayList.add(Saved_dataclass(R.drawable.swat2,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.tajmahal,"Taj Mahal",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"5.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.mountainss,"Mountains",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"2.5",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))
        savedArrayList.add(Saved_dataclass(R.drawable.sajekvalley,"Sajek Valley",R.drawable.map,"Bandarban, Bangladesh",R.drawable.star_image,"4.7",))

        val adapter=SavedAdapter(savedArrayList)
        saveRecyclerView.adapter=adapter
        val layout=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        saveRecyclerView.layoutManager=layout

        val eventRecyclerView=watch.findViewById<RecyclerView>(R.id.events_recyclerview)
        eventArrayList= ArrayList()

        eventArrayList.add(Saved_Event_dataclass(R.drawable.visit1,"Kaptai Lake Tour 2024",R.drawable.map,"Narayanganj, India","10+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake1,"Faisal lake Tour 2024",R.drawable.map,"Hunza, Pakistan","11+ People Already Joined",R.drawable.saved_image))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake3,"Beach Tour 2022",R.drawable.map,"Thiland","15+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake2,"Kaptai Lake Tour 2022",R.drawable.map,"Narayanganj, Bangladesh","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake1,"Kaptai Lake Tour 2022",R.drawable.map,"Hunza, Pakistan","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake3,"Kaptai Lake Tour 2022",R.drawable.map,"Thiland","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake2,"Kaptai Lake Tour 2022",R.drawable.map,"Narayanganj, Bangladesh","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake1,"Kaptai Lake Tour 2022",R.drawable.map,"Hunza, Pakistan","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake3,"Kaptai Lake Tour 2022",R.drawable.map,"Thiland","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake2,"Kaptai Lake Tour 2022",R.drawable.map,"Narayanganj, Bangladesh","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake1,"Kaptai Lake Tour 2022",R.drawable.map,"Hunza, Pakistan","12+ People Already Joined",R.drawable.unsaved))
        eventArrayList.add(Saved_Event_dataclass(R.drawable.lake3,"Kaptai Lake Tour 2022",R.drawable.map,"Thiland","12+ People Already Joined",R.drawable.unsaved))

        val eAdapter=SavedEventAdapter(eventArrayList)
        eventRecyclerView.adapter=eAdapter
        val thisLayout=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        eventRecyclerView.layoutManager=thisLayout

        return watch
    }

}