package com.example.viewbinding;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewbinding.databinding.FragmentABinding;


public class AFragment extends Fragment {


    public AFragment() {
        // Required empty public constructor
    }


    FragmentABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentABinding.inflate(inflater, container, false);

        binding.textFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textFragment.setTextColor(Color.parseColor("#FF0000"));
            }
        });
        return binding.getRoot();

    }
}