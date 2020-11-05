package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num_ans();
    }
    //返回上一頁
    public void click_back(View v){
        finish();
    }
    private void num_ans(){
        int number;

        Random num = new Random();
        int ans = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null){

            number = Integer.parseInt(bundle.getString("NUM"));
            TextView TF = (TextView)findViewById(R.id.TrueOrFalse);
            TextView big_or_small = (TextView)findViewById(R.id.BigOrSmall);

            if (number == ans){
                big_or_small.setText("Bingo");
                TF.setText("○");

            }
            else if (number > ans){
                big_or_small.setText("Guess Small");
                TF.setText("X");

            }
            else if (number < ans){
                big_or_small.setText("Guess Big");
                TF.setText("X");
            }
        }
    }
}