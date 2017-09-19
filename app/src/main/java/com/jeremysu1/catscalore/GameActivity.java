package com.jeremysu1.catscalore;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private ArrayList<Button> gridButtons = new ArrayList<>();
    private ArrayList<Integer> gridColors = new ArrayList<>();
    private ArrayList<Integer> remainingButtons = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11));
    private int current_button = -1;
    private Random rand = new Random();
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
        for(int i = 0; i < 12; i++) {
            setRandomColors(i, rand);
        }
        selectNewColor();
    }

    private void setRandomColors(int button_id, Random rand){
        Button btn = gridButtons.get(button_id);
        int R = rand.nextInt(256);
        int G = rand.nextInt(256);
        int B = rand.nextInt(256);
        int A = 255;
        int color = Color.argb(A, R, G, B);
        gridColors.add(button_id, color);
        btn.setBackgroundColor(color);
    }

    private void selectNewColor(){
        int size = remainingButtons.size();
        if(size == 0)
            return;
        Log.e("DEBUG", "RemainingButtons size is " + size);
        int new_button_id_index = rand.nextInt(size);
        Log.e("DEBUG", "NewButtonIdIndex for remainingButtons is " + new_button_id_index);
        int new_button_id = remainingButtons.get(new_button_id_index);
        Log.e("DEBUG", "RemainingButtons Id is " + new_button_id);
        int color = gridColors.get(new Integer(new_button_id));
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        current_button = new_button_id;

        Log.e("Next", "NEXT BUTTON IS " + new_button_id);

        TextView r_view = (TextView) findViewById(R.id.redTextView);
        TextView g_view = (TextView) findViewById(R.id.greenTextView);
        TextView b_view = (TextView) findViewById(R.id.blueTextView);

        r_view.setText(Integer.toString(red));
        g_view.setText(Integer.toString(green));
        b_view.setText(Integer.toString(blue));
    }


    public void gridButtonClick(View view){
        Button btn;
        int id = view.getId();
        switch(id){
            case R.id.btn0 :
                if(current_button == 0) {
                    btn = (Button) findViewById(R.id.btn0);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(0, -1);
                    remainingButtons.remove(new Integer(0));
                    selectNewColor();
                }
                break;
            case R.id.btn1 :
                if(current_button == 1) {
                    btn = (Button) findViewById(R.id.btn1);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(1, -1);
                    remainingButtons.remove(new Integer(1));
                    selectNewColor();
                }
                break;
            case R.id.btn2 :
                if(current_button == 2) {
                    btn = (Button) findViewById(R.id.btn2);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(2, -1);
                    remainingButtons.remove(new Integer(2));
                    selectNewColor();
                }
                break;
            case R.id.btn3 :
                if(current_button == 3) {
                    btn = (Button) findViewById(R.id.btn3);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(3, -1);
                    remainingButtons.remove(new Integer(3));
                    selectNewColor();
                }
                break;
            case R.id.btn4 :
                if(current_button == 4) {
                    btn = (Button) findViewById(R.id.btn4);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(4, -1);
                    remainingButtons.remove(new Integer(4));
                    selectNewColor();
                }
                break;
            case R.id.btn5 :
                if(current_button == 5) {
                    btn = (Button) findViewById(R.id.btn5);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(5, -1);
                    remainingButtons.remove(new Integer(5));
                    selectNewColor();
                }
                break;
            case R.id.btn6 :
                if(current_button == 6) {
                    btn = (Button) findViewById(R.id.btn6);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(6, -1);
                    remainingButtons.remove(new Integer(6));
                    selectNewColor();
                }
                break;
            case R.id.btn7 :
                if(current_button == 7) {
                    btn = (Button) findViewById(R.id.btn7);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(7, -1);
                    remainingButtons.remove(new Integer(7));
                    selectNewColor();
                }
                break;
            case R.id.btn8 :
                if(current_button == 8) {
                    btn = (Button) findViewById(R.id.btn8);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(8, -1);
                    remainingButtons.remove(new Integer(8));
                    selectNewColor();
                }
                break;
            case R.id.btn9 :
                if(current_button == 9) {
                    btn = (Button) findViewById(R.id.btn9);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(9, -1);
                    remainingButtons.remove(new Integer(9));
                    selectNewColor();
                }
                break;
            case R.id.btn10 :
                if(current_button == 10) {
                    btn = (Button) findViewById(R.id.btn10);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(10, -1);
                    remainingButtons.remove(new Integer(10));
                    selectNewColor();
                }
                break;
            case R.id.btn11 :
                if(current_button == 11) {
                    btn = (Button) findViewById(R.id.btn11);
                    btn.setVisibility(View.INVISIBLE);
                    //remainingButtons.set(11, -1);
                    remainingButtons.remove(new Integer(11));
                    selectNewColor();
                }
                break;
        }
    }

}
