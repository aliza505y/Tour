package com.example.tour.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.All_Services
import com.example.tour.R
import com.example.tour.dataclasses.Services_dataclass

class ServicesAdapter (private var context: Context,var sArray:ArrayList<Services_dataclass>):
        RecyclerView.Adapter<ServicesAdapter.MyViewHolder>(){

            inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                var servImage=itemView.findViewById<ImageView>(R.id.hotel_services)
                var servText=itemView.findViewById<TextView>(R.id.services_text)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val time=LayoutInflater.from(parent.context).inflate(R.layout.services_designfile,parent,false)
        return MyViewHolder(time)
    }

    override fun getItemCount(): Int {
        return sArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemCount=sArray[position]
        holder.servImage.setImageResource(itemCount.sHotel)
        holder.servText.text=itemCount.sName

        holder.itemView.setOnClickListener {
            val intent=Intent(context,All_Services::class.java)
            context.startActivity(intent)
            Toast.makeText(context,itemCount.sName,Toast.LENGTH_SHORT).show()
        }
    }

}