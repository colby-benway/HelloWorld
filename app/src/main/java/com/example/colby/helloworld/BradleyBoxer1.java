package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BradleyBoxer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bradley_boxer1);
    }

    public void onActivityTwoButtonClick(View v) {
        Intent intent = new Intent(this, BradleyBoxer2.class);
        startActivity(intent);
    }
}
