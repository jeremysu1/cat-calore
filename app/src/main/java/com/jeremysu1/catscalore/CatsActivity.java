package com.jeremysu1.catscalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class CatsActivity extends AppCompatActivity {

    private int[] pic_ids = {R.drawable.cat1,R.drawable.cat2, R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,
            R.drawable.cat6,R.drawable.cat7,R.drawable.cat8,R.drawable.cat9,R.drawable.cat10};
    private int current = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);
        Random rand = new Random();
        ImageView catPic = (ImageView) findViewById(R.id.catImage1);
        catPic.setImageResource(pic_ids[rand.nextInt(10)]);
    }



}
