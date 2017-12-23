package com.example.android.jeddahapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ebtesam on 12/23/2017 AD.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PublicPlaceFragment();
        } else if (position == 1) {
            return new MallsFragment();
        } else if (position == 2) {
            return new ResturantFragment();
        } else {
            return new EventFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Public_place_Fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.Malls_Fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.Resaurant_Fragment);
        } else {
            return mContext.getString(R.string.Event_Fragment);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
