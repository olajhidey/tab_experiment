package com.jonetech.tabexperiment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    int fNumOfTabs;

    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.fNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        // Get latest position of the view we in

        switch (position) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return fNumOfTabs;
    }
}
