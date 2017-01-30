package com.example.a4802.myradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tela2(View view){
        Intent Intentl = new Intent(getApplicationContext(), ELETRONICActivity.class);
        startActivity(Intentl);

    }

    public void tela3(View view) {
        Intent Intentl = new Intent(getApplicationContext(), GOSPELActivity.class);
        startActivity(Intentl);
    }

    public void tela4(View view) {
        Intent Intentl = new Intent(getApplicationContext(), REGGAEActivity.class);
        startActivity(Intentl);
    }
}
