package com.example.colby.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void launchCreateEvent(View v) {
        Intent intent = new Intent(this, CreateEventActivity.class);
        startActivity(intent);
    }

    public void launchYourEvents(View v) {
        Intent intent = new Intent(this, ViewEventPage.class);
        startActivity(intent);
    }

    public void callPedro(View v) {
        // removed pedro's phone number in github release

//        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
//        phoneIntent.setData(Uri.parse("tel:0"));
//        if (ActivityCompat.checkSelfPermission(this,
//                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//            Log.e("SUME", "permission denied");
//            return;
//        }
//        startActivity(phoneIntent);
    }
}
