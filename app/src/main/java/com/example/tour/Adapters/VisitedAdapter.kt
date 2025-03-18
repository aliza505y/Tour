package com.example.tour.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Most_Visited
import com.example.tour.R
import com.example.tour.dataclasses.Visited_dataclass

class VisitedAdapter(private val context: Context ,var vArray: ArrayList<Visited_dataclass>):
        RecyclerView.Adapter<VisitedAdapter.VisitedViewHolder>(){

            inner class VisitedViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val visImage=itemView.findViewById<ImageView>(R.id.imageView_visited)
                val visSave=itemView.findViewById<ImageView>(R.id.saved_visited)
                val visStar=itemView.findViewById<ImageView>(R.id.star_visit)
                val visNUmStar=itemView.findViewById<TextView>(R.id.num_star_visited)
                val visname=itemView.findViewById<TextView>(R.id.visit_place_name)
                val visMap=itemView.findViewById<ImageView>(R.id.map_visited)
                val visMapName=itemView.findViewById<TextView>(R.id.map_name_visited)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VisitedViewHolder {
          val portion=LayoutInflater.from(parent.context).inflate(R.layout.visited_designfile,parent,false)
        return VisitedViewHolder(portion)
    }

    override fun getItemCount(): Int {
       return vArray.size
    }

    override fun onBindViewHolder(holder: VisitedViewHolder, position: Int) {
        val visItem=vArray[position]
        holder.visImage.setImageResource(visItem.vImage)
        holder.visSave.setImageResource(visItem.vSave)
        holder.visStar.setImageResource(visItem.vStar)
        holder.visNUmStar.text=visItem.VNumStar
        holder.visname.text=visItem.vName
        holder.visMap.setImageResource(visItem.vmap)
        holder.visMapName.text=visItem.vMapName

        holder.itemView.setOnClickListener {
            val intent=Intent(context,Most_Visited::class.java)
            context.startActivity(intent)
            Toast.makeText(context,visItem.vName,Toast.LENGTH_SHORT).show()
        }
    }


}