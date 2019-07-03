package com.xb.saykat.abcd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer a_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a_sound= MediaPlayer.create(MainActivity.this,R.raw.a);
        a_sound.start();

        Button b = (Button)findViewById(R.id.button2);
        Button asound =(Button)findViewById(R.id.sound_icon);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,A.class);
                startActivity(i);
                finish();

            }
        });

        asound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a_sound= MediaPlayer.create(MainActivity.this,R.raw.a);
                a_sound.start();
            }
        });

    }
}
