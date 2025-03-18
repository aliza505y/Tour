package com.example.tour.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.R
import com.example.tour.dataclasses.AllCAtegory_dataclass

class AllCategoryAdapter(var allCAt: ArrayList<AllCAtegory_dataclass>):
        RecyclerView.Adapter<AllCategoryAdapter.CategoryViewHolder>(){

            inner class CategoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                var allcImage=itemView.findViewById<ImageView>(R.id.camp_allcategory)
                var allcText=itemView.findViewById<TextView>(R.id.name_camp_allCategry)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       val allCat=LayoutInflater.from(parent.context).inflate(R.layout.all_category_designfile,parent,false)
        return CategoryViewHolder(allCat)
    }

    override fun getItemCount(): Int {
        return allCAt.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val allCategory=allCAt[position]
        holder.allcImage.setImageResource(allCategory.allcatIMage)
        holder.allcText.text=allCategory.allcatText
    }
}