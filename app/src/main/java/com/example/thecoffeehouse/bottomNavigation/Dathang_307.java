package com.example.thecoffeehouse.bottomNavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.tablayout.ViewPagerAdapter_307;
import com.google.android.material.tabs.TabLayout;

public class Dathang_307 extends Fragment {

    private TabLayout mTabLayout_307;
    private ViewPager mViewPager_307;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_dathang, container, false);
        mTabLayout_307 = r.findViewById(R.id.tab_layout_307);
        mViewPager_307 = r.findViewById(R.id.view_pager_307);

        ViewPagerAdapter_307 viewPagerAdapter = new ViewPagerAdapter_307(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_307.setAdapter(viewPagerAdapter);
        mTabLayout_307.setupWithViewPager(mViewPager_307);
        return r;
    }

}