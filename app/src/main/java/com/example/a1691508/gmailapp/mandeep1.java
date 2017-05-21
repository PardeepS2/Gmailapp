package com.example.a1691508.gmailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mandeep1 extends AppCompatActivity {

    ImageView imp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandeep1);
        imp = (ImageView) findViewById(R.id.imageView2);

        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mandeep1.this, mandeep2.class);
                startActivity(intent);
            }
        });


    }
}
