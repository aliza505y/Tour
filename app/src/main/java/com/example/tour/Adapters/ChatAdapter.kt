package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.Chat_dataclass

class ChatAdapter(var chatArrayList: ArrayList<Chat_dataclass>):
        RecyclerView.Adapter<ChatAdapter.thisViewHolder>() {

            inner class thisViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val proimage=itemView.findViewById<ImageView>(R.id.chat_profile_image)
                val namechat=itemView.findViewById<TextView>(R.id.ishtiaq)
                val greetings=itemView.findViewById<TextView>(R.id.how_are_you)
                val datechat=itemView.findViewById<TextView>(R.id.chat_date)
                val timechat=itemView.findViewById<TextView>(R.id.chat_time)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): thisViewHolder {
        val function=LayoutInflater.from(parent.context).inflate(R.layout.chat_designfile,parent,false)
        return thisViewHolder(function)
    }

    override fun getItemCount(): Int {
    return chatArrayList.size
    }

    override fun onBindViewHolder(holder: thisViewHolder, position: Int) {
      val thisitem=chatArrayList[position]
        holder.proimage.setImageResource(thisitem.chProfile)
        holder.namechat.text=thisitem.chName
        holder.greetings.text=thisitem.chChat
        holder.datechat.text=thisitem.chDate
        holder.timechat.text=thisitem.chTime
    }


}