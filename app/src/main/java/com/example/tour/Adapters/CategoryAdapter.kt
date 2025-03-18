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
import com.example.tour.CategoriesSeeAll
import com.example.tour.R
import com.example.tour.dataclasses.Category_dataclass

class CategoryAdapter(private val context: Context, var catArray: ArrayList<Category_dataclass>) :
    RecyclerView.Adapter<CategoryAdapter.MyViewholder>() {

    inner class MyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cammp = itemView.findViewById<ImageView>(R.id.camp)
        val campText = itemView.findViewById<TextView>(R.id.name_camp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val vieww = LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_designfile, parent, false)
        return MyViewholder(vieww)
    }

    override fun getItemCount(): Int {
        return catArray.size
    }


    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val categoryitem = catArray[position]
        holder.cammp.setImageResource(categoryitem.image)
        holder.campText.text = categoryitem.name

        holder.itemView.setOnClickListener {
            val intent = Intent(context, CategoriesSeeAll::class.java)
            //intent.putExtra("categoryName",categoryitem.name)
            context.startActivity(intent)
            Toast.makeText(context, categoryitem.name, Toast.LENGTH_SHORT).show()//optional
        }
/*ni smj a rhe ?? thori agai ha
* jis activity sy jana ha us k adapter mn extra put kr k jis mn jana udher mn.kit mn get krna
* book now button waly adapter my chlo*/
        /*holder.cammp.setOnClickListener {
           val intent = Intent(context, Categories::class.java)
           context.startActivity(intent)
       }
       */

        /* holder.campText.setOnClickListener {
          val intent = Intent(context, Categories::class.java)
          context.startActivity(intent)
      }*/

        // data pas k ley intent k ander function milta putExtra osko use krty
        // putExtra() 2 things dena hoti first is "key" 2 is value
        // yha per "key" mane de ha categoryName ye kuch b ho skte ha bs ek name dena ye use hogi gi next acticity my value get k ley
        // now remeber val categoryitem = catArray[position]
        // es variable categoryitem k ander jes per click hoga os poisition ke name aur img hogi
        // abi hmy name chahy tu ham categoryitem.name kr k name ke value get kr ly gy
        // yha per itna he kam any question ?  noo

        //  ab os category pr jaye gy jes pr data send kea aur wha get kr ly gy


        // listen recycler view my asa ni hota 1 activity he use hoti for all items
        // for example instagram per posts my recyler view ha agr mujy kesi picture view krna
            // tu asa tu nhi onho har post py click k leye new activity bnai hogi wo tu billions
        // my po    sai sai agai ha smajh


        // yha per holder jo design file esko dety hain onki ids ko access krwata hmy for performing some kind of actions

        // agr category ke img per click krk next activity pr jana ha then:

        // agr hm only category name pr click krk agy jana chahy then holder.


        // agr hm complete category desgin single item os pr click krk agy jana chahythen:
        // itemview use kea jata ha itemview my puri design file ke ids hoti hain

        // yha per toast optional ha just for showing temporary msges
        // name es liay use kia k jo bhi word us design k ander ho wohi name sho
    // hn mean k agr koi beach pr click kry tu beach places show hon agr lakes then
        // lakes places  aik specific word likhna ho hr k liay tu
        // os k leye intent k sath data pass krty hain
        // agr adapter k click listner smj agye hain tu ye comments clear kro
        // chlo leave it abi
        // ek sath use krna optional but agr itemview ham tu seprately use krny koi sense ni




        // now understand data passing between activities
        //// start it




    }
}