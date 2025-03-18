package com.example.tour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.NotiAdapter
import com.example.tour.dataclasses.Notification_dataclass

class Notification_Fragment : Fragment() {

    private lateinit var notifyarraylist: ArrayList<Notification_dataclass>
    private lateinit var notifyAdapter: NotiAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_notification_fragment, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview_notification)
        notifyarraylist = ArrayList()
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.aeroplane,
                "Flite Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.icon,
                "App Update",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )
        notifyarraylist.add(
            Notification_dataclass(
                R.drawable.ellipse,
                R.drawable.hotel,
                "Hotel Booking",
                "Lorem ipsum dolor sit amet this for the\nconsectetur. Suspendisse quam...",
                "12:45 PM",
                "August 12, 2023"
            )
        )

        val adapter = NotiAdapter(notifyarraylist)
        recyclerView.adapter = adapter
        val thislayout = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = thislayout


        return view
    }

    // ye first screen ka name kia ha?? splash

   //pehly bnaya tha jab uper array list likha tha okk
    // run it
        // ye function q banna ha??



}