package com.example.itay.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton IB;
    ImageView IV;
    Random rnd=new Random();
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IV=(ImageView) findViewById(R.id.IV);
        IB=(ImageButton) findViewById(R.id.IB);
    }


    public void click(View view) {
       x=rnd.nextInt(3)+1;
        switch (x){
            case 1:IV.setImageResource(R.drawable.dogone);
                   IB.setImageResource(R.drawable.buttonone);
                   break;
            case 2:IV.setImageResource(R.drawable.dogtwo);
                   IB.setImageResource(R.drawable.buttontwo);
                   break;
            case 3:IV.setImageResource(R.drawable.dogthree);
                   IB.setImageResource(R.drawable.buttonthree);
                   break;
        }
    }}

