package com.example.nakulbhoria.TourGuideApp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightPlacesFragment extends Fragment {

    ArrayList<Location> locations = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        RecyclerView listView = rootView.findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));

        locations.add(new Location(getString(R.string.club_pangaea), getString(R.string.club_pangaea_address), R.drawable.pangaea_club));
        locations.add(new Location(getString(R.string.comesum), getString(R.string.comesum_address), R.drawable.comesum));
        locations.add(new Location(getString(R.string.india_gate), getString(R.string.india_gate_address), R.drawable.india_gate_at_night));
        locations.add(new Location(getString(R.string.mocha_art_house), getString(R.string.mocha_art_house_address), R.drawable.mocha_art_house));
        locations.add(new Location(getString(R.string.blue_bar), getString(R.string.blue_bar_address), R.drawable.blue_bar));

        listView.setAdapter(new LocationAdapter(locations));

        return rootView;
    }

}
