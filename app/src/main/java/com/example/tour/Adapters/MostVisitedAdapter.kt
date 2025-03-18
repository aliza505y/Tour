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
import com.example.tour.Place_Details
import com.example.tour.R
import com.example.tour.dataclasses.MostVisited_dataclass

class MostVisitedAdapter(private var context: Context,var msArray: ArrayList<MostVisited_dataclass>):
        RecyclerView.Adapter<MostVisitedAdapter.MyViewholder>(){

            inner class MyViewholder(itemView: View):RecyclerView.ViewHolder(itemView){
                val mvisIMage=itemView.findViewById<ImageView>(R.id.most_visited_image)
                val mvisName=itemView.findViewById<TextView>(R.id.most_visited_name_place)
                val mvisstarNUM=itemView.findViewById<TextView>(R.id.most_visited_num_star)
                val mvislocation=itemView.findViewById<TextView>(R.id.most_visited_location)
                val mvisdollar=itemView.findViewById<TextView>(R.id.most_visited_dollar)
                val mvisBook=itemView.findViewById<AppCompatButton>(R.id.most_visited_book)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
      val section=  LayoutInflater.from(parent.context).inflate(R.layout.most_visited_designfile,parent,false)
        return MyViewholder(section)
    }

    override fun getItemCount(): Int {
        return msArray.size
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val thisItem=msArray[position]
        holder.mvisIMage.setImageResource(thisItem.mvImage)
        holder.mvisName.text=thisItem.msname
        holder.mvisstarNUM.text=thisItem.msNumStar
        holder.mvislocation.text=thisItem.maLocation
        holder.mvisdollar.text=thisItem.msDollar

        holder.mvisBook.setOnClickListener {
            val intent=Intent(context,Place_Details::class.java)
            intent.putExtra("thisImage",thisItem.mvImage)
            intent.putExtra("thisName",thisItem.msname)
            intent.putExtra("thisstarNum",thisItem.msNumStar)
            intent.putExtra("thisLocation",thisItem.maLocation)
            intent.putExtra("thisdollar",thisItem.msDollar)
            context.startActivity(intent)
        }
    }
}
