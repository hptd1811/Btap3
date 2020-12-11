package com.example.thecoffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Notify_307 extends AppCompatActivity {

    ImageView imgClose_307, img_307;
    Button bt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify_action);

        imgClose_307 = findViewById(R.id.imageClose_307);
        imgClose_307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        bt = findViewById(R.id.button_307);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        img_307 = findViewById(R.id.image);
        img_307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    void open() {
        Intent view = new Intent(Notify_307.this, MainActivity_307.class);
        startActivity(view);
    }

    public void openDialog() {
        ExampleDialog_307 exampleDialog = new ExampleDialog_307();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}
