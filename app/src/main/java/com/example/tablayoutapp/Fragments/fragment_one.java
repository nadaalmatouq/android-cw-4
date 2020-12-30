package com.example.tablayoutapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tablayoutapp.R;

public class fragment_one extends Fragment {

    public fragment_one() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //in order to conncet the component of this view's xml with this view
        View v = inflater.inflate(R.layout.fragment_one,container,false);

       //TextView = v.findViewById(R.id.name);

        //use get acitivity instead of contex becuz wera using inflater
        Toast.makeText(getActivity(),"Sweaters",Toast.LENGTH_SHORT).show();





        return v;
    }
}