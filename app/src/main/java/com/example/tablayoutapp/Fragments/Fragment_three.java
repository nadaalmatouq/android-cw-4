package com.example.tablayoutapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tablayoutapp.R;

public class Fragment_three extends Fragment {


    public Fragment_three() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_three, container, false);
        Toast.makeText(getActivity(),"T-shirts",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        return v;
    }
}