package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.drawable.ball1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button;
        button = (Button)findViewById(R.id.button_Ask);
        final ImageView ball = (ImageView)findViewById(R.id.ball1);

        final int[] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGen = new Random();
                int number = randomNumberGen.nextInt(5);
//                Log.d("Magic Eight Ball","Button is sucessfully clicked");
//                final int d = Log.d("Magic Eight Ball", "number " + number);
                ball.setImageResource(ballArray[number]);


            }
        });

    }
}
