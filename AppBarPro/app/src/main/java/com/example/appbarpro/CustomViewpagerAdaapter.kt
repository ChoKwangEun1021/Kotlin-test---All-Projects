package com.example.appbarpro

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomViewpagerAdaapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    val fragmentList = ArrayList<Fragment>()

    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList.get(position)

    fun addListFragment(fragment: Fragment){
        this.fragmentList.add(fragment)
    }

}