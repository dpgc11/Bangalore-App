package com.example.android.bangalore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Yogesh on 23-11-2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case(1):
                return new Entertainment();
            case(2):
                return new AestheticBuildings();
            case(3):
                return new Restaurants();
            default:
                return new TopAttractions();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case(1):
                return "Entertainment";
            case(2):
                return "Architecture";
            case(3):
                return "Restaurants";
            default:
                return "Attractions";
        }
    }
}
