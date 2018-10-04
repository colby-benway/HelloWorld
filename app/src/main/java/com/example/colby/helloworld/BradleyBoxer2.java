package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BradleyBoxer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bradley_boxer2);
    }

    public void onActivityOneButtonClick(View v) {
        Intent intent = new Intent(this, BradleyBoxer1.class);
        startActivity(intent);
    }
}
