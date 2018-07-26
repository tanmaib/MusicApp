package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button btnToFirst;
    ImageButton btnToSecond, btnToThird, btnToFourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        btnToFirst = (Button) findViewById(R.id.button1_a2);
        btnToSecond = (ImageButton) findViewById(R.id.button3_a2);
        btnToThird = (ImageButton) findViewById(R.id.button4_a2);
        btnToFourth = (ImageButton) findViewById(R.id.button5_a2);

        btnToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                SecondActivity.this.startActivity(intent);
            }
        });

        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Click to Play previous Track");
            }
        });

        btnToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Click to Play Music");
            }
        });

        btnToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMessage("Click to Play next Track");
            }
        });
    }

    /**
     * This method is used to create toast
     */
    public void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
