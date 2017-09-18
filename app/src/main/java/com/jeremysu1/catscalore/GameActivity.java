package com.jeremysu1.catscalore;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    ArrayList<Button> gridButtons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);


        gridButtons.add((Button) findViewById(R.id.btn0));
        gridButtons.add((Button) findViewById(R.id.btn1));
        gridButtons.add((Button) findViewById(R.id.btn2));
        gridButtons.add((Button) findViewById(R.id.btn3));
        gridButtons.add((Button) findViewById(R.id.btn4));
        gridButtons.add((Button) findViewById(R.id.btn5));
        gridButtons.add((Button) findViewById(R.id.btn6));
        gridButtons.add((Button) findViewById(R.id.btn7));
        gridButtons.add((Button) findViewById(R.id.btn8));
        gridButtons.add((Button) findViewById(R.id.btn9));
        gridButtons.add((Button) findViewById(R.id.btn10));
        gridButtons.add((Button) findViewById(R.id.btn11));
        Random rand = new Random();
        for(int i = 0; i < 12; i++){
            setRandomColors(i, rand);
        }

        //btn.setBackgroundColor(Color.);
    }

    private void setRandomColors(int button_id, Random rand){
        Button btn = gridButtons.get(button_id);
        ;
        int R = rand.nextInt(256);
        int G = rand.nextInt(256);
        int B = rand.nextInt(256);
        int A = 255;
        int color = Color.argb(A, R, G, B);
        btn.setBackgroundColor(color);
    }


    public void gridButtonClick(View view){
        Button btn;
        switch(view.getId()){
            case R.id.btn0 :
                btn = (Button) findViewById(R.id.btn0);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn1 :
                btn = (Button) findViewById(R.id.btn1);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn2 :
                btn = (Button) findViewById(R.id.btn2);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn3 :
                btn = (Button) findViewById(R.id.btn3);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn4 :
                btn = (Button) findViewById(R.id.btn4);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn5 :
                btn = (Button) findViewById(R.id.btn5);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn6 :
                btn = (Button) findViewById(R.id.btn6);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn7 :
                btn = (Button) findViewById(R.id.btn7);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn8 :
                btn = (Button) findViewById(R.id.btn8);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn9 :
                btn = (Button) findViewById(R.id.btn9);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn10 :
                btn = (Button) findViewById(R.id.btn10);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn11 :
                btn = (Button) findViewById(R.id.btn11);
                btn.setVisibility(View.INVISIBLE);
                break;
        }
    }

}
