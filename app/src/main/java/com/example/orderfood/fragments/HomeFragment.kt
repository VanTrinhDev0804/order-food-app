package com.example.orderfood.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.OrientationHelper.*
import androidx.recyclerview.widget.RecyclerView
import com.example.orderfood.Adapters.CategoryAdapter
import com.example.orderfood.Adapters.PopularAdapter
import com.example.orderfood.DataClass.Category
import com.example.orderfood.DataClass.PopularItem
import com.example.orderfood.R
import com.example.orderfood.Views.CartListActivity
import com.example.orderfood.Views.CreateAccountActivity
import com.example.orderfood.databinding.FragmentHomeBinding
//import com.google.firebase.database.*
//import com.google.firebase.database.ktx.database
//import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    private lateinit var recyclerCateView: RecyclerView
    private lateinit var categroryList: ArrayList<Category>
    lateinit var imageCategoryID :Array<Int>
    lateinit var titleCategory :Array<String>

//popular
    private lateinit var recyclerPopularView: RecyclerView
    private lateinit var popularList: ArrayList<PopularItem>
    lateinit var imagePopularID :Array<Int>
    lateinit var titlePopular :Array<String>
    lateinit var price :Array<Double>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var bind = FragmentHomeBinding.inflate(layoutInflater)


        bind.cardBtn.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(),CartListActivity::class.java )
            startActivity(intent)
        }

// category
        imageCategoryID = arrayOf(
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
            )
        titleCategory = arrayOf("Pizza","Burger","Hotdog","Drink","Dount")
        recyclerCateView = bind.listCategoryView
        recyclerCateView.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerCateView.setHasFixedSize(true)
        categroryList = arrayListOf<Category>()
        getCategoryData()

//        Popular

        imagePopularID = arrayOf(
            R.drawable.burger,
            R.drawable.pizza1,
            R.drawable.pizza2
        )
        titlePopular = arrayOf("Cheese Burger","Pepperoni pizza","Vegetable pizza")
        price = arrayOf(8.79,9.76,8.5)

        recyclerPopularView = bind.listPopularView
        recyclerPopularView.layoutManager =  LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerPopularView.setHasFixedSize(true)
        popularList = arrayListOf<PopularItem>()
        getPopularData()


        return bind.root
    }

    private fun getPopularData() {
        for(i in imagePopularID.indices){
            var popularitems =PopularItem(titlePopular[i],imageCategoryID[i], price[i])
            popularList.add(popularitems)
        }
        recyclerPopularView.adapter = PopularAdapter(popularList)
    }

    private fun getCategoryData() {
        for(i in imageCategoryID.indices){
            var categoryItem = Category(imageCategoryID[i],titleCategory[i])
            categroryList.add(categoryItem)
        }
        recyclerCateView.adapter = CategoryAdapter(categroryList)
    }

}

