package com.cardinalskerrt.cultureapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class UserScreen extends AppCompatActivity {

    TableLayout userTabLayout;
    ViewPager userViewPager;
    PageAdapter userPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_screen);

        userTabLayout = findViewById(R.id.userTabLayout);
        userViewPager = findViewById(R.id.userViewPager);

        userPageAdapter = new PageAdapter(getSupportFragmentManager(), 3);
        userViewPager.setAdapter(userPageAdapter);
    }

    //page adapter for this activity
    private static class PageAdapter extends FragmentPagerAdapter {
        int numOfTabs;

        public PageAdapter(FragmentManager fn, int numOfTabs){
            super(fn);
            this.numOfTabs = numOfTabs;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            //TODO return the fragments
            return null;
        }

        @Override
        public int getCount() {
            return numOfTabs;
        }

        @Override
        public int getItemPosition(@NonNull Object object) {
            return super.getItemPosition(object);
        }
    }

}
