package com.example.homework5_m6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.homework5_m6.UI.MainFragment
import com.example.homework5_m6.UI.ResultFragment
import com.example.homework5_m6.UI.StoryFragment


class CountAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position) {

            0 -> {
                return MainFragment()
            }

            1 -> {
                return ResultFragment()
            }

            2 -> {
                return StoryFragment()
            }

            else -> {
                return MainFragment()
            }
        }
    }
}