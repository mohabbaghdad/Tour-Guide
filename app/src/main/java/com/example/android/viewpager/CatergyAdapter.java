package com.example.android.viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tourguideapp.CafesFragment;
import com.example.tourguideapp.HotelsFragment;
import com.example.tourguideapp.MallsFragment;
import com.example.tourguideapp.R;
import com.example.tourguideapp.RestaurantFragment;

public class CatergyAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CatergyAdapter(FragmentManager fm, Context context1) {
        super(fm);
        mContext = context1;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new CafesFragment();
        } else {
            return new MallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.category_cafes);
        } else {
            return mContext.getString(R.string.category_malls);
        }
    }
}