package com.example.nakulbhoria.TourGuideApp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class NightPlaces extends AppCompatActivity {

    ArrayList<Location> locations = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        RecyclerView listView = findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(this));

        locations.add(new Location(getString(R.string.club_pangaea),getString(R.string.club_pangaea_address),R.drawable.pangaea_club));
        locations.add(new Location(getString(R.string.comesum),getString(R.string.comesum_address),R.drawable.comesum));
        locations.add(new Location(getString(R.string.india_gate),getString(R.string.india_gate_address),R.drawable.india_gate_at_night));
        locations.add(new Location(getString(R.string.mocha_art_house),getString(R.string.mocha_art_house_address),R.drawable.mocha_art_house));
        locations.add(new Location(getString(R.string.blue_bar),getString(R.string.blue_bar_address),R.drawable.blue_bar));

        listView.setAdapter(new LocationAdapter(locations));







    }
}