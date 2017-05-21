package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class jeewanSecondScreen extends AppCompatActivity {

    ImageView mno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jeewan_second_screen);
        mno = (ImageView) findViewById(R.id.imageView25);
        mno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(jeewanSecondScreen.this, Main5Activity.class);
                startActivity(intent);
            }
        });

    }
}
