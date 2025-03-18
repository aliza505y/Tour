package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.Saved_Event_dataclass

class SavedEventAdapter(val eventArray: ArrayList<Saved_Event_dataclass>):
        RecyclerView.Adapter<SavedEventAdapter.thisViewHolder>(){

            inner class thisViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val eventImage=itemView.findViewById<ImageView>(R.id.event_image)
                val eventname=itemView.findViewById<TextView>(R.id.event_name)
                val eventlocation=itemView.findViewById<ImageView>(R.id.location)
                val eventLocationame=itemView.findViewById<TextView>(R.id.location_event)
                val eventPeoeple=itemView.findViewById<TextView>(R.id.number_of_joined)
                val eventUnsaved=itemView.findViewById<ImageView>(R.id.unsaved_Image)

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): thisViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.events_designfile,parent,false)
        return thisViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventArray.size
    }

    override fun onBindViewHolder(holder: thisViewHolder, position: Int) {
         val item=eventArray[position]
        holder.eventImage.setImageResource(item.eImage)
        holder.eventname.text=item.eName
        holder.eventlocation.setImageResource(item.elocation)
        holder.eventLocationame.text=item.elocName
        holder.eventPeoeple.text=item.people
        holder.eventUnsaved.setImageResource(item.unSaved)
    }
}