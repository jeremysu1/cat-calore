package com.jeremysu1.catscalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }

    public void gridButtonClick(View view){
        Button btn;
        switch(view.getId()){
            case R.id.btn00 :
                btn = (Button) findViewById(R.id.btn00);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn01 :
                btn = (Button) findViewById(R.id.btn01);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn02 :
                btn = (Button) findViewById(R.id.btn02);
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
            case R.id.btn12 :
                btn = (Button) findViewById(R.id.btn12);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn20 :
                btn = (Button) findViewById(R.id.btn20);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn21 :
                btn = (Button) findViewById(R.id.btn21);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn22 :
                btn = (Button) findViewById(R.id.btn22);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn30 :
                btn = (Button) findViewById(R.id.btn30);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn31 :
                btn = (Button) findViewById(R.id.btn31);
                btn.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn32 :
                btn = (Button) findViewById(R.id.btn32);
                btn.setVisibility(View.INVISIBLE);
                break;
        }
    }

}
