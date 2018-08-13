package com.example.nakulbhoria.TourGuideApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hotelClick(View view) {
        Intent i = new Intent(this, Hotels.class);
        startActivity(i);
    }

    public void malls(View view) {
        Intent i = new Intent(this, Malls.class);
        startActivity(i);
    }

    public void night(View view) {
        Intent i = new Intent(this, NightPlaces.class);
        startActivity(i);
    }

    public void places(View view) {
        Intent i = new Intent(this, Places.class);
        startActivity(i);
    }
}
