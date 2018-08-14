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
public class PlacesFragment extends Fragment {


    ArrayList<Location> locations = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        RecyclerView listView = rootView.findViewById(R.id.recycler_view);
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        locations.add(new Location(getString(R.string.red_fort), getString(R.string.red_fort_address), R.drawable.red_fort));
        locations.add(new Location(getString(R.string.india_gate), getString(R.string.india_gate_address), R.drawable.india_gate));
        locations.add(new Location(getString(R.string.jama_masjid), getString(R.string.jama_masjid_address), R.drawable.jama_masjid));
        locations.add(new Location(getString(R.string.qutub_minar), getString(R.string.qutub_minar_address), R.drawable.qutub_minar));
        locations.add(new Location(getString(R.string.humanyun_tomb), getString(R.string.humanyun_tomb_address), R.drawable.humayun_tomb));
        LocationAdapter adapter = new LocationAdapter(locations);
        listView.setAdapter(adapter);

        return rootView;
    }

}
