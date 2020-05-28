package com.candra.navigation_drawer.ui.subway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.candra.navigation_drawer.R;

public class SubwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subway);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Subway Bus");
        }
    }
}
