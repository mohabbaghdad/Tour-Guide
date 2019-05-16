package com.example.tourguideapp;

public class customArrayList {
    private int mPlaceName;
    private int mAddress;
    private int mPhoneNumber;
    private int mImageId;

    public customArrayList(int PlaceName, int Address, int imageid, int PhoneNumber) {
        mPlaceName = PlaceName;
        mAddress = Address;
        mImageId = imageid;
        mPhoneNumber = PhoneNumber;

    }

    public int getmPlaceName() {
        return mPlaceName;
    }

    public int getmPhoneNumber() {
        return mPhoneNumber;
    }

    public int getmAddress() {
        return mAddress;
    }

    public int getImageId() {
        return mImageId;
    }

}
