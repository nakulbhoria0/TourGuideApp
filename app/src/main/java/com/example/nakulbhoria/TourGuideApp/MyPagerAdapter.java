package com.example.nakulbhoria.TourGuideApp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public MyPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new PlacesFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new MallsFragment();
            case 3:
                return new NightPlacesFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.places);
            case 1:
                return mContext.getString(R.string.hotels);
            case 2:
                return mContext.getString(R.string.malls);
            case 3:
                return mContext.getString(R.string.night_places);
            default:
                return null;
        }

    }
}
