package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    ImageView imq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imq = (ImageView) findViewById(R.id.imageView8);
        imq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, mandeep1.class);
                startActivity(intent);
            }
        });


    }
}

