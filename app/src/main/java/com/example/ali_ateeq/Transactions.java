package com.example.ali_ateeq;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.rhexgomez.typer.roboto.TyperRoboto;

public class Transactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
       // collapsingToolbar.setCollapsedTitleTypeface(TyperRoboto.ROBOTO_REGULAR());
        // collapsingToolbar.setExpandedTitleTypeface(TyperRoboto.ROBOTO_REGULAR());
        collapsingToolbar.setTitle("Ali ATEEQ");
        collapsingToolbar.setCollapsedTitleTextColor(Color.rgb(255, 255, 255));


    }
}