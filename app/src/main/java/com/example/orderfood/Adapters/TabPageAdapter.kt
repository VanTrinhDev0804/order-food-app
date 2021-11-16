package com.example.orderfood.Adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.orderfood.Views.MainActivity
import com.example.orderfood.fragments.AccountFragment
import com.example.orderfood.fragments.HomeFragment
import com.example.orderfood.fragments.SettingFragment
import com.example.orderfood.fragments.SupportFragment

class TabPageAdapter (activity: FragmentActivity, private  val tabCount: Int) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int = tabCount;

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> HomeFragment()
            1 ->AccountFragment()
            2 ->SupportFragment()
            3 ->SettingFragment()
            else -> HomeFragment()
        }
    }

}
