package com.example.nakulbhoria.TourGuideApp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    ArrayList<Location> locations = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        RecyclerView listView = findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(this));
        locations.add(new Location(getString(R.string.itc_maurya), getString(R.string.itc_maurya_adress), R.drawable.itc_maurya));
        locations.add(new Location(getString(R.string.taj_palace), getString(R.string.taj_palace_address), R.drawable.taj_palace_hotel));
        locations.add(new Location(getString(R.string.the_imperial), getString(R.string.the_imperial_adress), R.drawable.the_imperial));
        locations.add(new Location(getString(R.string.the_leela_palace), getString(R.string.the_leela_palace_address), R.drawable.the_leela_palace));
        locations.add(new Location(getString(R.string.the_oberoi), getString(R.string.the_oberoi_adress), R.drawable.the_oberoi));
        listView.setAdapter(new LocationAdapter(locations));







    }
}
