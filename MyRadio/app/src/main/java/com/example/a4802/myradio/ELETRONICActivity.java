package com.example.a4802.myradio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class ELETRONICActivity extends AppCompatActivity {
    private Button button_stop;
    private Button button_play;
    private String STREAM_URL = "http://80.64.135.231:80/house";
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletronic);
        button_stop = (Button) findViewById(R.id.button_stop);

        button_play = (Button)findViewById(R.id.button_play);



        mPlayer = new MediaPlayer();



        button_play.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                try {

                    mPlayer.setDataSource(STREAM_URL);

                    mPlayer.prepareAsync();

                    mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

                        @Override

                        public void onPrepared(MediaPlayer mp) {

                            mp.start();

                        }

                    });





                } catch (IOException e) {

                    e.printStackTrace();

                }



            }

        });



        button_stop.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                mPlayer.stop();



            }

        });
    }
}


