package com.example.orderfood.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.orderfood.R
import com.example.orderfood.Views.CartListActivity
import com.example.orderfood.Views.CreateAccountActivity
import com.example.orderfood.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
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
        return bind.root


    }

}

