package com.example.tour

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.CategoryAdapter
import com.example.tour.Adapters.ServicesAdapter
import com.example.tour.Adapters.TopEventsAdapter
import com.example.tour.Adapters.VisitedAdapter
import com.example.tour.dataclasses.Category_dataclass
import com.example.tour.dataclasses.Services_dataclass
import com.example.tour.dataclasses.TopEvents_dataclass
import com.example.tour.dataclasses.Visited_dataclass

class Home_Fragment : Fragment() {

    private lateinit var categoryArrayList: ArrayList<Category_dataclass>
    private lateinit var adapter: CategoryAdapter

    private lateinit var visitedArrayList: ArrayList<Visited_dataclass>
    private lateinit var visAdapter: VisitedAdapter

    private lateinit var servicesArrayList:ArrayList<Services_dataclass>
    private lateinit var servicesAdapter:ServicesAdapter

    private lateinit var topEventArrayList: ArrayList<TopEvents_dataclass>
    private lateinit var topEventsAdapter: TopEventsAdapter


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_fragment, container, false)

        //to new activties
        view.findViewById<ImageView>(R.id.profile_image).setOnClickListener {
            startActivity(Intent(requireContext(),MyProfile::class.java))
        }

        view.findViewById<TextView>(R.id.see_all_category).setOnClickListener {
            startActivity(Intent(requireContext(), CategoriesSeeAll::class.java))
        }

        view.findViewById<TextView>(R.id.visited_see_all).setOnClickListener {
            startActivity(Intent(requireContext(),Most_Visited::class.java))
        }

        view.findViewById<TextView>(R.id.see_all_services).setOnClickListener {
            startActivity(Intent(requireContext(),All_Services::class.java))
        }



        val allCatergoryrecycler = view.findViewById<RecyclerView>(R.id.categories_recyclerview)
        categoryArrayList = ArrayList()

        categoryArrayList.add(Category_dataclass(R.drawable.mountain, "Mountains"))
        categoryArrayList.add(Category_dataclass(R.drawable.beach, "Beach"))
        categoryArrayList.add(Category_dataclass(R.drawable.lakes, "Lakes"))
        categoryArrayList.add(Category_dataclass(R.drawable.camp, "Camp"))
        categoryArrayList.add(Category_dataclass(R.drawable.mountain, "Mountains"))
        categoryArrayList.add(Category_dataclass(R.drawable.beach, "Beach"))
        categoryArrayList.add(Category_dataclass(R.drawable.lakes, "Lakes"))
        categoryArrayList.add(Category_dataclass(R.drawable.camp, "Camp"))
        categoryArrayList.add(Category_dataclass(R.drawable.mountain, "Mountains"))
        categoryArrayList.add(Category_dataclass(R.drawable.beach, "Beach"))
        categoryArrayList.add(Category_dataclass(R.drawable.lakes, "Lakes"))
        categoryArrayList.add(Category_dataclass(R.drawable.camp, "Camp"))


        /*require context kis jaga py aur kion use krty hain*/
/*ye b ek tra ka context he bs fragment my requireContext krty use*/
        /*context basically ye hota k hmri App k ander 10,20,30, activity ho skti i
        * ha ab kasy pta chly k kis activity kis per jana ha
        * for example 2 activity hain A aur B mujy A sy B my jana
        * tu ma Intent(context,B::class.java)
        * actually mymane SDK ko inform kra k mujy A sy jana ha B tu A ke jga Context use kea
        * smjy context ?? gg
        *  mountain py click krny sy jo activity i wo tu bnai nai thi*/
        val categoryAdapter = CategoryAdapter(requireContext(),categoryArrayList)
        allCatergoryrecycler.adapter = categoryAdapter
        val thisLayout =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        allCatergoryrecycler.layoutManager = (thisLayout)


        val visitedRecyclerView = view.findViewById<RecyclerView>(R.id.visitrecyclerview)
        visitedArrayList = ArrayList()

        visitedArrayList.add(
            Visited_dataclass(
                R.drawable.visited,
                R.drawable.saved_image,
                R.drawable.stars,
                "4.7",
                "Kanchenjungha",
                R.drawable.white_map,
                "Rangpur, Bangladesh"
            )
        )
        visitedArrayList.add(
            Visited_dataclass(
                R.drawable.e,
                R.drawable.saved_image,
                R.drawable.stars,
                "4.7",
                "Changa Manga",
                R.drawable.white_map,
                "Rangpur, Malaysia"
            )
        )
        visitedArrayList.add(
            Visited_dataclass(
                R.drawable.s1,
                R.drawable.saved_image,
                R.drawable.stars,
                "4.7",
                "K 2",
                R.drawable.white_map,
                "Mountain, Pakistan"
            )
        )
        visitedArrayList.add(
            Visited_dataclass(
                R.drawable.glacier,
                R.drawable.saved_image,
                R.drawable.stars,
                "4.7",
                "Passu Glacier",
                R.drawable.white_map,
                "Hunza, Pakistan"
            )
        )

        visitedArrayList.add(
            Visited_dataclass(
                R.drawable.coverimage,
                R.drawable.saved_image,
                R.drawable.stars,
                "4.7",
                "SunFlower",
                R.drawable.white_map,
                "Multan, Pakistan"
            )
        )

        val visitAdapter = VisitedAdapter(requireContext(),visitedArrayList)
        visitedRecyclerView.adapter = visitAdapter
        val visitLayout = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        visitedRecyclerView.layoutManager = (visitLayout)


        val servRecyclerView=view.findViewById<RecyclerView>(R.id.services_recyclerview)
        servicesArrayList=ArrayList()

        servicesArrayList.add(Services_dataclass(R.drawable.boat,"Hotel"))
        servicesArrayList.add(Services_dataclass(R.drawable.flight,"Flight"))
        servicesArrayList.add(Services_dataclass(R.drawable.bus,"Bus"))
        servicesArrayList.add(Services_dataclass(R.drawable.boat,"Boat"))
        servicesArrayList.add(Services_dataclass(R.drawable.flight,"Flight"))
        servicesArrayList.add(Services_dataclass(R.drawable.bus,"Bus"))
        servicesArrayList.add(Services_dataclass(R.drawable.boat,"Boat"))
        servicesArrayList.add(Services_dataclass(R.drawable.flight,"Flight"))
        servicesArrayList.add(Services_dataclass(R.drawable.bus,"Bus"))
        servicesArrayList.add(Services_dataclass(R.drawable.boat,"Boat"))

        val adapter=ServicesAdapter(requireContext(),servicesArrayList)
        servRecyclerView.adapter=adapter
        val servicess=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        servRecyclerView.layoutManager= (servicess)

        val tpRecyclerView=view.findViewById<RecyclerView>(R.id.top_events_recyclerview)
        topEventArrayList= ArrayList()

        topEventArrayList.add(TopEvents_dataclass(R.drawable.s5))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s6))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s7))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s7))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s8))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s5))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s6))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s7))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s8))
        topEventArrayList.add(TopEvents_dataclass(R.drawable.s5))

        val EventsAdapter =TopEventsAdapter(topEventArrayList)
        tpRecyclerView.adapter=EventsAdapter
        val timees=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        tpRecyclerView.layoutManager=timees
        return view
    }
}

        // activity my 'this' krty context k leye
        // fragment my requireContext ya requireActivity  ok
        //run it

        // ek cheez jab skip per click ho tu direct mainActivity App ke open honi chahy
        // jab bottom right my arrow button click ho tb one by one next actiivty
        /*visited wali pics mnn in k corners kasy round krni ye tu pic asi thi agr koi
        * aur pic lagain tu wo square mn he ati ha */

        // ye pic asi ni the es my alag sy design banana tha jes my es ko design krk adapter
        // my set krna
        // square img round k easy way ha ya tu os ko card view k inside rkh lo aur
        // card view ko corner radius add krdo
        // ya library use




