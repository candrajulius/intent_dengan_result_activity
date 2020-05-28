package com.candra.navigation_drawer;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    CircleImageView candra;
    private DrawerLayout drawer;
    String uri = "https://lh3.googleusercontent.com/-dxeloJdH154/XpsCSewMEBI/AAAAAAAAAJg/_QKn3xcq0mYL_WdIecO3VsMlftm2GgpRgCEwYBhgLKs0DAL1OcqxnY0cJXtCM8pj1TLcBhPWI8nIGY6Da6u0PIiyZkxDd0Dao1icQ2uXzRfhATZ5Qh80EXWETkLWpdONHBCoN5yZMeL9IAfHLT4KVCCwspkDj4n8NCBxW3metaqo8kKPFrr1x375jo-wLkXBIDbPKe09IcDR0DT1wyY8STcg_6KMFbm40ALq39Y2t_RIi5AKF64kuDLzx1-soB6Yi2GL92FyKmF0ZSXNqQjVLSD0hUvLgIRYUDmqU0yNZH0hnGMfYpX5hd7YhE9rBvq4OD853gUiDc1vspH8wFrH4uSf5BBXLYo-zUBmGEc5JROB5Q5J0ptM7-Rn5Rxzh2QFl3bh9csH-qd0eRRoYNucZaLoPwuBFGZERN_hOa0Fg8XWt6ndF0qAfZUr6hw-uNH876OsIn3Jt8TpZmC1cLQ29fT2PJERdDWNRde1uUzxuOrQorTFy-zXhDSsrL5b7UtzaerD2zb_i0X20Zk6z9NfHH4dZVbpvUFXu7cG7x5Y2JbAHq6o49RxQDWx8olF9a0WzNuvS0bdu3cE08ZIaxv_nhzuK1WrAFuLbpZXmCoWMcn2ak0ow4ldldAd9reSKGsZtjerMmm7EQWXU8c-tj0Qw5Ins9AU/w139-h140-p/IMG_20200408_183004%255B1%255D.jpg";

    private AppBarConfiguration mAppBarConfiguration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab); // Menginisiasi sebuah fab untuk icon
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // untuk memberikan aksi pada icon di bawah
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG) // Snackbar yang memberikan aksi pada icon
                        .setAction("Action", new View.OnClickListener() { // Membuat aksi pada icon
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this,"Ini adalah icon email ",Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
         drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.buka,R.string.tutup);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        candra = navigationView.getHeaderView(0).findViewById(R.id.imageView); // Menginisiasi semua menu yang ditampung pada header
        Glide.with(MainActivity.this).load(uri).into(candra); // membuat sebuah foto pada circle image view
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//
//        mAppBarConfiguration = new AppBarConfiguration.Builder( // Menginisasi semua fragment yang di buat di menu
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, // Inisiasi id yang ada dimenu
//                R.id.nav_tools, R.id.nav_share, R.id.nav_send,R.id.cart1) // Inisiasi id yang ada dimenu
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment); // menginisiasi sebuah fragment pada menu bar
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration); // Mengatur judul pada ction bar
//        NavigationUI.setupWithNavController(navigationView, navController); // menampilkan fragment yang sesuai ketika di pilih
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Mengatur ketika tombol back ditekan di sebuah fragment
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, toogle)
//                || super.onSupportNavigateUp();
//    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
