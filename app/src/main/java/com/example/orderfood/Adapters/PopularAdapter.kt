package com.example.orderfood.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfood.DataClass.PopularItem
import com.example.orderfood.R

class PopularAdapter (private val popularList :ArrayList<PopularItem>)
    : RecyclerView.Adapter<PopularAdapter.PopulerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopulerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        var currentItem = popularList[position]
        holder.titlePopular.text = currentItem.title
        holder.image.setImageResource(currentItem.image)
        holder.txtPrice.text= currentItem.price.toString()
    }

    override fun getItemCount(): Int {
        return  popularList.size
    }
    class PopulerViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {
        var titlePopular: TextView= itemView.findViewById(R.id.titlePopular)
        var image : ImageView = itemView.findViewById(R.id.picPopuler)
        var txtPrice :TextView = itemView.findViewById(R.id.txtPrice)
    }
}