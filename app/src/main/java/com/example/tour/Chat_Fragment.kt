package com.example.tour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.ChatAdapter
import com.example.tour.dataclasses.Chat_dataclass

class Chat_Fragment : Fragment() {

    private lateinit var chatArraylist:ArrayList<Chat_dataclass>
    private lateinit var chatadapter:ChatAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat_fragment, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.chat_recyclerview)
        chatArraylist = ArrayList()

        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ferdous,
                "Ferdous Hussain",
                "What's up?",
                "7 Sep 2022",
                "12:45PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 May 2022",
                "1:05AM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.hassan,
                "Hassan Ali",
                "Thank you!",
                "20 Sep 2022",
                "12:45PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.mujahid,
                "Mujahid Alom",
                "Nice",
                "1 Aug 2022",
                "7:45PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.naeem,
                "Naeem Ali",
                "Let's go",
                "2 Jan 2022",
                "12:45PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.waqas,
                "Waqas Mughal",
                "Where are you going?",
                "20 Sep 2022",
                "3:10PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )
        chatArraylist.add(
            Chat_dataclass(
                R.drawable.ishtiaq,
                "Ishtiaq Zaman",
                "Hello Raju How are you?",
                "20 Sep 2022",
                "12:45 PM"
            )
        )

        val adapter=ChatAdapter(chatArraylist)
        recyclerView.adapter=adapter
        val thisLayout=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager=thisLayout
        return view
    }


}