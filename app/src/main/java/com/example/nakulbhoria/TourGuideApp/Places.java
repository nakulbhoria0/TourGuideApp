package com.example.nakulbhoria.TourGuideApp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Places extends AppCompatActivity {

    ArrayList<Location> locations = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        RecyclerView listView = findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(this));
        locations.add(new Location(getString(R.string.red_fort), getString(R.string.red_fort_address), R.drawable.red_fort));
        locations.add(new Location(getString(R.string.india_gate), getString(R.string.india_gate_address), R.drawable.india_gate));
        locations.add(new Location(getString(R.string.jama_masjid),getString(R.string.jama_masjid_address), R.drawable.jama_masjid));
        locations.add(new Location(getString(R.string.qutub_minar), getString(R.string.qutub_minar_address), R.drawable.qutub_minar));
        locations.add(new Location(getString(R.string.humanyun_tomb), getString(R.string.humanyun_tomb_address), R.drawable.humayun_tomb));
        LocationAdapter adapter = new LocationAdapter(locations);
        listView.setAdapter(adapter);

        //listView.setAdapter(new LocationAdapter(locations));







    }
}