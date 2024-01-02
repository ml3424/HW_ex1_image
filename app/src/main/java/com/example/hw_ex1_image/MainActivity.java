package com.example.hw_ex1_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    ImageView iv1;
    Random rnd = new Random();
    int numRand = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        iv1 = findViewById(R.id.iv1);
    }

    public void click(View view) {
        numRand = rnd.nextInt(3) + 1;
        btn1.setText(""+numRand);
        if(numRand == 1)
        {
            iv1.setImageResource(R.drawable.hellokitty1);
        }
        else if(numRand == 2)
        {
            iv1.setImageResource(R.drawable.hellokitty2);
        }
        else
        {
            iv1.setImageResource(R.drawable.hellokitty3);
        }
    }
}