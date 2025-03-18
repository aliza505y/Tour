package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.MostVisited_dataclass
import com.example.tour.dataclasses.Notification_dataclass

class NotiAdapter(var notificationarraylist: ArrayList<Notification_dataclass>):
        RecyclerView.Adapter<NotiAdapter.Myviewholder>(){

    inner class Myviewholder (itemView: View):RecyclerView.ViewHolder(itemView){
                  val dotimagee=itemView.findViewById<ImageView>(R.id.dot)
              val hoteelimage:ImageView= itemView.findViewById(R.id.hotel)
              val hotelbb=itemView.findViewById<TextView>(R.id.hotel_booking)
              val hoteldes=itemView.findViewById<TextView>(R.id.hotel_description)
              val hoteltt=itemView.findViewById<TextView>(R.id.time)
              val hoteldd=itemView.findViewById<TextView>(R.id.date)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val scene=LayoutInflater.from(parent.context).inflate(R.layout.notifiction_designfile,parent,false)
        return Myviewholder(scene)

    }

    override fun getItemCount(): Int {
        return notificationarraylist.size
            }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val currentItem= notificationarraylist[position]
        holder.hoteelimage.setImageResource(currentItem.dotimage)
        holder.hoteelimage.setImageResource(currentItem.hotelImage)
        holder.hotelbb.text=(currentItem.name)
        holder.hoteldes.text=(currentItem.descript)
        holder.hoteltt.text=(currentItem.timeHotel)
        holder.hoteldd.text=(currentItem.dateHotel)

    }
}