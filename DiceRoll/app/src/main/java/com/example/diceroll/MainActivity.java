package com.example.diceroll;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button roll;
    private ImageView imageViewDice, imageViewDice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll = (Button) findViewById(R.id.rollDices);
        imageViewDice = (ImageView) findViewById(R.id.imageView1);
        imageViewDice2 = (ImageView) findViewById(R.id.imageView2);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }

    private void roll() {
        int v1 = RANDOM.nextInt(6) + 1;
        int v2 = RANDOM.nextInt(6) + 1;
        switch (v1) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice_6);
                break;
        }

        switch (v2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice_6);
                break;
        }
    }

}
