package com.example.tablayoutapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutapp.Fragments.Fragment_three;
import com.example.tablayoutapp.Fragments.fragment_one;
import com.example.tablayoutapp.Fragments.fragment_two;

// Adapter to connect each fragment with its view

public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    //depending on position fragment view will show
    public Fragment getItem(int position) {
        switch (position){


            case 0:
                return new fragment_one();
            case 1:
                return new fragment_two();
            case 2:
                return new Fragment_three();

        }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
