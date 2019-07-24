package com.example.academysix;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter
{
    private int totalTabs;

    MyAdapter(FragmentManager fm, int totalTabs)
    {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0: return new Tab1();
            case 1: return new Tab2();
            default: return null;
        }
    }
    @Override
    public int getCount()
    {
        return totalTabs;
    }
}