package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class SignupInterestSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_interest_selection);

        LinearLayout layout = findViewById(R.id.interest_topics);
        String[] topics = {"American Football", "College Life", "Concerts", "Computers & Tech", "Shopping", "Tabletop Gaming",
                "Food", "Politics", "Performing Arts", "Video Games", "Gourmet Food", "Dating", "Bicycling", "Cars"};

        for(int i=0;i<topics.length;i++) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setPadding(10, 20, 10, 20);
            checkBox.setTextSize(24);
            checkBox.setText(topics[i]);
            layout.addView(checkBox);
        }
    }

    public void continueSignup(View v) {
        Intent intent = new Intent(this, SignupGroupSelectionActivity.class);
        startActivity(intent);
    }
}
