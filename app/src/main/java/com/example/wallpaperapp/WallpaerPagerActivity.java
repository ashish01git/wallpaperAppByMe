package com.example.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class WallpaerPagerActivity extends AppCompatActivity {

    int pos;
    ArrayList<String> allImageList=new ArrayList<>();
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaer_pager);

        pos=getIntent().getIntExtra("pos",0);
        allImageList=getIntent().getStringArrayListExtra("list");
        viewpager=findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter=new PagerAdapter(WallpaerPagerActivity.this,allImageList);
        viewpager.setAdapter(pagerAdapter);
        viewpager.setCurrentItem(pos);


    }
}