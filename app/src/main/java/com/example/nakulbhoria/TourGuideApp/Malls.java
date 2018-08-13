package com.example.nakulbhoria.TourGuideApp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    ArrayList<Location> locations = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        RecyclerView listView = findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(this));
        locations.add(new Location(getString(R.string.star_city),getString(R.string.star_city_mall_address), R.drawable.star_city_mall));
        locations.add(new Location(getString(R.string.select_citywalk_mall),getString(R.string.select_citywalk_mall_address), R.drawable.select_citywalk));
        locations.add(new Location(getString(R.string.Ambience_mall),getString(R.string.Ambience_mall_adress), R.drawable.ambience_mall));
        locations.add(new Location(getString(R.string.dlf_promenade),getString(R.string.dlf_promenade_adress), R.drawable.dlf_promenade_mall));
        locations.add(new Location(getString(R.string.dlf_place_saket_mall),getString(R.string.dlf_place_saket_mall_address), R.drawable.dlf_place_saket));

        listView.setAdapter(new LocationAdapter(locations));

    }
}