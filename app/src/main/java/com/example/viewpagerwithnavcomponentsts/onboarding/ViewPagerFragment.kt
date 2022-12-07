package com.example.viewpagerwithnavcomponentsts.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.viewpagerwithnavcomponentsts.R
import com.example.viewpagerwithnavcomponentsts.onboarding.screens.FirstScreen
import com.example.viewpagerwithnavcomponentsts.onboarding.screens.SecondScreen
import com.example.viewpagerwithnavcomponentsts.onboarding.screens.ThirdScreen


class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

//    private val viewPager:ViewPager by lazy { requireActivity().findViewById(R.id.viewPager) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

            view.findViewById<ViewPager>(R.id.viewPager).adapter = adapter

        return view
    }




}