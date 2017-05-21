package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mandeep1 extends AppCompatActivity {

    ImageView ima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandeep1);
        ima = (ImageView)  findViewById(R.id.imageView2);
    }

    public void mainClick(View view) {
        Intent intent = new Intent(this, mandeep2.class);
        startActivity(intent);
    }


}
