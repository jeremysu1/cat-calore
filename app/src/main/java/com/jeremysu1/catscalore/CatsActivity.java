package com.jeremysu1.catscalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class CatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);
        ImageView catPic = (ImageView) findViewById(R.id.catImage1);
        Picasso.with(this).load("https://thecatapi.com/api/images/get?type=jpg").into(catPic);
    }
}
