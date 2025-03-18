package com.example.tour.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Hotel_Details
import com.example.tour.R
import com.example.tour.dataclasses.MoreServices_dataclass

class MoreServicesAdapter( private val context: Context,var msArray: ArrayList<MoreServices_dataclass>):
        RecyclerView.Adapter<MoreServicesAdapter.MyViewholder>(){

            inner class MyViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
                val bookNowBtn=itemView.findViewById<AppCompatButton>(R.id.more_services_book)
                val mserImage=itemView.findViewById<ImageView>(R.id.more_services_image)
                val mserName=itemView.findViewById<TextView>(R.id.more_services_name_place)
                val mserNumSatr=itemView.findViewById<TextView>(R.id.more_services_num_star)
                val mserLocation=itemView.findViewById<TextView>(R.id.more_services_location)
                val mserDollar=itemView.findViewById<TextView>(R.id.more_services_dollar)
                val mserPrice=itemView.findViewById<TextView>(R.id.more_services_dollar_price)
/*fix kro ye errors */
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
       val create=LayoutInflater.from(parent.context).inflate(R.layout.more_services_designfile,parent,false)
        return MyViewholder(create)
    }

    override fun getItemCount(): Int {
        return msArray.size
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val dataClass=msArray[position]
        holder.mserImage.setImageResource(dataClass.msImage)
        holder.mserName.text=dataClass.msName
        holder.mserNumSatr.text=dataClass.msNumStar
        holder.mserLocation.text=dataClass.msLocation
        holder.mserDollar.text=dataClass.msDollar
        holder.mserPrice.text=dataClass.msPrice
/*i was mean k button per click krna ha button id ?  more_services_book findview by id kro  */
        /*ab hotel details activity per receive kro alll data and set in views*/
        /* 5 value send krni one is extra here*/
        holder.bookNowBtn.setOnClickListener {
            val intent=Intent(context,Hotel_Details::class.java)
            intent.putExtra("itemImage",dataClass.msImage)
            intent.putExtra("itemName",dataClass.msName)
            intent.putExtra("itemDollar",dataClass.msDollar)
            intent.putExtra("itemlocation",dataClass.msLocation)
            intent.putExtra("itemStars",dataClass.msNumStar)
            /*baqi data bhi kron put jo get krna han lekin key jo wo relevent honi chahy */
            context.startActivity(intent)
        }
    }
}