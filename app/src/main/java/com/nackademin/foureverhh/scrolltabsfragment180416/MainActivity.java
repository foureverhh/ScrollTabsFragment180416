package com.nackademin.foureverhh.scrolltabsfragment180416;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      viewPager = findViewById(R.id.pager);
      FragmentManager manager = getSupportFragmentManager();
      viewPager.setAdapter(new MyAdapter(manager));
    }
}

class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if(position == 0){
            fragment = new FragmentA();
        }
        if(position == 1){
            fragment = new FragmentB();
        }
        if(position == 2){
            fragment = new FragmentC();
        }
        Log.e("State","Get Item "+ String.valueOf(position));
        return fragment;
    }

    @Override
    public int getCount() {
        Log.e("State","Get count");
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        switch (position){
            case 0:
                return title = "Tab A";

            case 1:
                return title = "Tab B";

            case 2:
                return title = "Tab C";

        }
        return  null;
    }
}