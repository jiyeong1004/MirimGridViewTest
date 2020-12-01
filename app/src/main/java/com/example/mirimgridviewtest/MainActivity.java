package com.example.mirimgridviewtest;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView gridv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화포스터 목록");
        gridv = findViewById(R.id.gridv);
        GridAdapter adapter = new GridAdapter(this);
        gridv.setAdapter(adapter);
    }
}