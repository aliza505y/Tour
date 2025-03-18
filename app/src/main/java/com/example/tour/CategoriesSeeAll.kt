package com.example.tour

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tour.Adapters.AllCategoryAdapter
import com.example.tour.dataclasses.AllCAtegory_dataclass

class CategoriesSeeAll : AppCompatActivity() {

    private lateinit var allCategoriesArray:ArrayList<AllCAtegory_dataclass>
    private lateinit var allcatAdapter:AllCategoryAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_see_all)
       /* val categoryTV = findViewById<TextView>(R.id.TV)
        val nameOfCategory = intent.getStringExtra("categoryName") // yha pr key pass krni spelling should same otherwise data recive ni hoga
        categoryTV.text =  nameOfCategory*/

        val allcatRecyclerView=findViewById<RecyclerView>(R.id.allCategory_recyclerView)
        allCategoriesArray= ArrayList()
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.beach,"Beach"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.beach,"Beach"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.beach,"Beach"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.beach,"Beach"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.mountain,"Mountains"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.camp,"Camp"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.lakes,"Lakes"))
        allCategoriesArray.add(AllCAtegory_dataclass(R.drawable.beach,"Beach"))





        val adapter=AllCategoryAdapter(allCategoriesArray)
        allcatRecyclerView.layoutManager=GridLayoutManager(this,4)
        allcatRecyclerView.adapter=adapter

    }

}