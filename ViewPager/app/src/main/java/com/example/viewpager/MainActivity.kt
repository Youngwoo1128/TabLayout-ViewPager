package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD(), FragmentE(), FragmentF())
        val adapter = FragmentAdapter(supportFragmentManager, 1)
        adapter.fragmentList = fragmentList
        binding.viewPager.adapter = adapter

        binding.tabLayout.post(Runnable {
            kotlin.run {
                binding.tabLayout.setupWithViewPager(binding.viewPager)
                binding.tabLayout.setTabsFromPagerAdapter(adapter)
            }
        })
    }
}