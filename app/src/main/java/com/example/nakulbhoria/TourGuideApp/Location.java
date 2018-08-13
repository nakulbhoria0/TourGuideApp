package com.example.nakulbhoria.TourGuideApp;

public class Location {

    private String mName;
    private String mAddress;
    private int mImage;

    public Location(String name, String address, int image) {
        mName = name;
        mAddress = address;
        mImage = image;

    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getName() {
        return mName;
    }


    public String getAddress() {
        return mAddress;
    }


    public int getImage() {
        return mImage;
    }
}
