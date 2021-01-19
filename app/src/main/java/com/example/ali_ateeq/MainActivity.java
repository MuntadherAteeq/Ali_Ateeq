package com.example.ali_ateeq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add fragment Here
        adapter.AddFragment(new FragmentInbox(),"");
        adapter.AddFragment(new FragmentHistory(),"");
        adapter.AddFragment(new FragmentWalet(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        // add icon
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_inbox);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_history);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_other);
    }


    public void addNewDeal(View view) {
        Intent intent = new Intent(this, Crate_new_Deal_Activity.class);
        startActivity(intent);

    }
}