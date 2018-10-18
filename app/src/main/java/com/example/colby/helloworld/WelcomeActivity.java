package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void launchMap(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void launchCalendar(View v) {
        //Intent intent = new Intent(this, MapActivity.class);
        //startActivity(intent);
    }

    public void launchDiscover(View v) {
        //Intent intent = new Intent(this, MapActivity.class);
        //startActivity(intent);
    }

    public void launchCreateEvent(View v) {
        //Intent intent = new Intent(this, CreateEventActivity.class);
        //startActivity(intent);
    }

    public void launchYourEvents(View v) {
        //Intent intent = new Intent(this, MapActivity.class);
        //startActivity(intent);
    }
}
