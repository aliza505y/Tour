package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.AllServices_dataclass

class AllServicesAdapter (var asArrayList: ArrayList<AllServices_dataclass>):
        RecyclerView.Adapter<AllServicesAdapter.MyViewholder>(){

            inner class MyViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
                val aServiceImage=itemView.findViewById<ImageView>(R.id.hotel_all_services)
                val aserviceText=itemView.findViewById<TextView>(R.id.all_services_text)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val image=LayoutInflater.from(parent.context).inflate(R.layout.all_services_designfile,parent,false)
        return MyViewholder(image)
    }

    override fun getItemCount(): Int {
       return asArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val itemView = asArrayList[position]
        holder.aServiceImage.setImageResource(itemView.allsImaga)
        holder.aserviceText.text=itemView.allstext
    }
}