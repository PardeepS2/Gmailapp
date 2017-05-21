package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mandeep2 extends AppCompatActivity {

    ImageView imo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandeep2);

        imo = (ImageView) findViewById(R.id.imageView28);
        imo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mandeep2.this, JeewanScreenOne.class);
                startActivity(intent);
            }
        });

    }
}
