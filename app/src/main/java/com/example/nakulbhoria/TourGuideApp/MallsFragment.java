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
public class MallsFragment extends Fragment {

    ArrayList<Location> locations = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        RecyclerView listView = rootView.findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        locations.add(new Location(getString(R.string.star_city), getString(R.string.star_city_mall_address), R.drawable.star_city_mall));
        locations.add(new Location(getString(R.string.select_citywalk_mall), getString(R.string.select_citywalk_mall_address), R.drawable.select_citywalk));
        locations.add(new Location(getString(R.string.Ambience_mall), getString(R.string.Ambience_mall_adress), R.drawable.ambience_mall));
        locations.add(new Location(getString(R.string.dlf_promenade), getString(R.string.dlf_promenade_adress), R.drawable.dlf_promenade_mall));
        locations.add(new Location(getString(R.string.dlf_place_saket_mall), getString(R.string.dlf_place_saket_mall_address), R.drawable.dlf_place_saket));

        listView.setAdapter(new LocationAdapter(locations));
        return rootView;
    }

}
