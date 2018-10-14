package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class SignupGroupSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_group_selection);

        LinearLayout layout = findViewById(R.id.groups);
        String[] topics = {"Very Gouda Cheese Club", "Big Sleep (tm)", "\uD83C\uDD71ochester \uD83C\uDD71nstitute of \uD83C\uDD71echnology",
                "Michael Cera Fan Club", "I'm Batman.", "People Who Don't Think The Universe Be Like It Is",
                "r/inthesoulstone", "H2O H8ters", "Sharknado Survivors", "The Holla Back Girls", "Spooky Scary Skeletons",
                "Video Game Club", "Video Game Club 2", "Video Game Club 3", };

        for(int i=0;i<topics.length;i++) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setPadding(10, 20, 10, 20);
            checkBox.setTextSize(24);
            checkBox.setText(topics[i]);
            layout.addView(checkBox);
        }
    }

    public void completeSignup(View v) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
