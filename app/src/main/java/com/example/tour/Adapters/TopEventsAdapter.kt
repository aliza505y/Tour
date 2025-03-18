package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.TopEvents_dataclass
import com.makeramen.roundedimageview.RoundedImageView

class TopEventsAdapter (var topArray: ArrayList<TopEvents_dataclass>):
        RecyclerView.Adapter<TopEventsAdapter.MyViewHolder>(){

            inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val tpImage=itemView.findViewById<RoundedImageView>(R.id.top_events_image)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val vieww=LayoutInflater.from(parent.context).inflate(R.layout.top_events_designfile,parent,false)
        return MyViewHolder(vieww)
     }

    override fun getItemCount(): Int {
       return topArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemView=topArray[position]
        holder.tpImage.setImageResource(itemView.image)
    }
}