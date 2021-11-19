package com.example.orderfood.extensions

import android.app.Activity
import android.widget.Toast
import com.example.orderfood.Views.MainActivity


object Extensions {
    fun Activity.toast(msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}