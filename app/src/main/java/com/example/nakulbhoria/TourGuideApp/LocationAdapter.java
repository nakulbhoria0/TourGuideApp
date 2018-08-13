package com.example.nakulbhoria.TourGuideApp;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder>{


    private ArrayList<Location> locations;

    LocationAdapter(ArrayList<Location> locations) {
        this.locations = locations;
    }


    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        return new LocationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        Location data = locations.get(position);
        holder.name.setText(data.getName());
        holder.address.setText(data.getAddress());
        holder.imageView.setImageResource(data.getImage());

    }


    @Override
    public int getItemCount() {
        return locations.size();
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView address;
        LocationViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            name.setSelected(true);
            address.setSelected(true);
        }
    }
}
