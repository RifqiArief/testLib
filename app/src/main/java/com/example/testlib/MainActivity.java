package com.example.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.test.penjumlahan.Point;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Point point = new Point();

        int a  = point.plus(1,2);

    }
}