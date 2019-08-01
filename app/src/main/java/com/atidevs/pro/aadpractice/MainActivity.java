package com.atidevs.pro.aadpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.atidevs.pro.aadpractice.androidcore.AndroidCoreActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAndroidCore(View view) {
        Intent intent = new Intent(getApplicationContext(), AndroidCoreActivity.class);
        startActivity(intent);
    }
}
