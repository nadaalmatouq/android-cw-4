package com.example.tablayoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect xml with code
        ViewPager vp = findViewById(R.id.vp);
        TabLayout t1 = findViewById(R.id.tabLayout);


        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        //connect viewpager with tablayout
        t1.setupWithViewPager(vp);


        //t1.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        //t1.getTabAt(1).setIcon(R.drawable.ic_baseline_home_24);
        //t1.getTabAt(2).setIcon(R.drawable.ic_baseline_home_24);
        t1.getTabAt(0).setIcon(R.drawable.sweater);
        t1.getTabAt(1).setIcon(R.drawable.pant);
        t1.getTabAt(2).setIcon(R.drawable.tshirt);










    }
}