package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnToSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToSecond = (Button) findViewById(R.id.button2_a1);
        ListView mListView = (ListView) findViewById(R.id.theList);

        //Create the Songs objects
        Songs s1 = new Songs("Lottery","Jade Bird","3.0");
        Songs s2 = new Songs("I Heard You","SAINt JHN","4.0");
        Songs s3 = new Songs("Pristine" ,"Snail Mail","5.2");
        Songs s4 = new Songs("Look Alive","BlocBoy JB","3.1");
        Songs s5 = new Songs("Singles You Up"," Jordan Davis","2.1");
        Songs s6 = new Songs("Te Boté"," Casper Magico","3.8");
        Songs s7 = new Songs("Four Out of Five" ,"Arctic Monkeys","6.8");
        Songs s8 = new Songs("Call Out My Name" ,"The Weeknd","2.9");
        Songs s9 = new Songs("A$AP Forever","A$AP Rocky ","4.5");

        //Add the Songs objects to an ArrayList
        ArrayList<Songs> songList = new ArrayList<>();
        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        songList.add(s5);
        songList.add(s6);
        songList.add(s7);
        songList.add(s8);
        songList.add(s9);

        SongsListAdapter adapter = new SongsListAdapter(this, R.layout.view_layout , songList);
        mListView.setAdapter(adapter);

        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
