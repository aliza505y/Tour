package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.Saved_dataclass

class SavedAdapter(val savedAdapter: ArrayList<Saved_dataclass>):
        RecyclerView.Adapter<SavedAdapter.Myviewholder>(){

            inner class Myviewholder(itemView: View):RecyclerView.ViewHolder(itemView){
                val pImage=itemView.findViewById<ImageView>(R.id.places_image)
                val pName=itemView.findViewById<TextView>(R.id.valley_name_place)
                val lImage=itemView.findViewById<ImageView>(R.id.map_image)
                val lName=itemView.findViewById<TextView>(R.id.location_place)
                val sImage=itemView.findViewById<ImageView>(R.id.star_image_places)
                val sNumberr=itemView.findViewById<TextView>(R.id.stars_numbers)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.places_design_file,parent,false)
        return Myviewholder(view)
    }

    override fun getItemCount(): Int {
          return savedAdapter.size
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val thisPortion=savedAdapter[position]
        holder.pImage.setImageResource(thisPortion.placeprofile)
        holder.pName.text=thisPortion.placeName
        holder.lImage.setImageResource(thisPortion.pLocation)
        holder.lName.text=thisPortion.pLocationName
        holder.sImage.setImageResource(thisPortion.pStar)
        holder.sNumberr.text=thisPortion.pStarnumber
    }

}