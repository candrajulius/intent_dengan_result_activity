package com.candra.navigation_drawer.ui.Hotel;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.candra.navigation_drawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hotel_Fragment extends Fragment {


    public Hotel_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel_, container, false);
    }

}
