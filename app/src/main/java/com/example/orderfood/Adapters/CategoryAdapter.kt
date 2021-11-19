package com.example.orderfood.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfood.DataClass.Category
import com.example.orderfood.R
import com.google.android.material.imageview.ShapeableImageView

class CategoryAdapter(private val categoryList :ArrayList<Category>)
    : RecyclerView.Adapter<CategoryAdapter.CateViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CateViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CateViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CateViewHolder, position: Int) {

        var currentItem = categoryList[position]
        holder.titleCate.text = currentItem.titleCategory
        holder.imageCate.setImageResource(currentItem.Inmage)
    }

    override fun getItemCount(): Int {
        return  categoryList.size
    }
    class CateViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var titleCate :TextView = itemView.findViewById(R.id.categoryName)
        var imageCate : ImageView = itemView.findViewById(R.id.categoryPic)
    }
}