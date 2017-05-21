package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        im = (ImageView)  findViewById(R.id.imageView8);
    }

    public void mainClick(View view) {
        Intent intent = new Intent(this, mandeep1.class);
        startActivity(intent);
    }



}

