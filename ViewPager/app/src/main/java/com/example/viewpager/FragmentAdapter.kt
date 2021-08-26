package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior){

    var fragmentList = listOf<Fragment>()

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "채팅"
            1 -> "구매내역"
            2 -> "마이톡"
            3 -> "찜"
            4 -> "알림"
            else -> "그냥"
        }
    }
}