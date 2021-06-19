package com.s3bqour.fragmentviewpagerapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.s3bqour.fragmentviewpagerapplication.FragmentsViewPagerAdapter;
import com.s3bqour.fragmentviewpagerapplication.R;


public class HomeFragment extends Fragment {

    ViewPager viewPager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parentView = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager=parentView.findViewById(R.id.my_view_pager);

        FragmentsViewPagerAdapter myFragmentsViewPagerAdapter =
                new FragmentsViewPagerAdapter(getParentFragmentManager());

        viewPager.setAdapter(myFragmentsViewPagerAdapter);

        return parentView;
    }
}