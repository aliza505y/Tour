package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.SelectRoom_dataclass

class SelectRoomAdapter (var rrArrayList: ArrayList<SelectRoom_dataclass>):
        RecyclerView.Adapter<SelectRoomAdapter.MyViewHolder>(){

            inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val rrImage=itemView.findViewById<ImageView>(R.id.room_image)
                val rDbed=itemView.findViewById<TextView>(R.id.double_bed)
                val rBedImage=itemView.findViewById<ImageView>(R.id.room_icon)
                val bed=itemView.findViewById<TextView>(R.id.room_number)
                val userr=itemView.findViewById<ImageView>(R.id.user)
                val guests=itemView.findViewById<TextView>(R.id.guests)
                val smook=itemView.findViewById<ImageView>(R.id.no_smooking_image)
                val noSmooking=itemView.findViewById<TextView>(R.id.no_smooking_text)
                val dollar=itemView.findViewById<TextView>(R.id.dollar_room)
                val perNight=itemView.findViewById<TextView>(R.id.room_night)
                val viewss=itemView.findViewById<TextView>(R.id.more_details_room)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.select_room_designfile,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return rrArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemCount=rrArrayList[position]
        holder.rrImage.setImageResource(itemCount.rImage)
        holder.rDbed.text=itemCount.rDoubleBed
        holder.rBedImage.setImageResource(itemCount.rbedimage)
        holder.bed.text=itemCount.rBed
        holder.userr.setImageResource(itemCount.rUser)
        holder.guests.text=itemCount.rGuest
        holder.smook.setImageResource(itemCount.smookingimage)
        holder.noSmooking.text=itemCount.noSmooking
        holder.dollar.text=itemCount.rdollar
        holder.perNight.text=itemCount.rnight
        holder.viewss.text=itemCount.viewDetails

    }
}