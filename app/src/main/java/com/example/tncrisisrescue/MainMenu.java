package com.example.tncrisisrescue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainMenu extends AppCompatActivity {
    RelativeLayout r1;
    RelativeLayout r2;
    RelativeLayout r3;
    RelativeLayout r4;
    RelativeLayout r5;
    RelativeLayout r6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        r1 = (RelativeLayout) findViewById(R.id.rv1);
        r2 = (RelativeLayout) findViewById(R.id.rv2);
        r3 = (RelativeLayout) findViewById(R.id.rv3);
        r4 = (RelativeLayout) findViewById(R.id.rv4);
        r5 = (RelativeLayout) findViewById(R.id.rv5);
        r6 = (RelativeLayout) findViewById(R.id.rv6);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EssentialPassReg.class);
                startActivity(intent);
            }
        });
    }
}
