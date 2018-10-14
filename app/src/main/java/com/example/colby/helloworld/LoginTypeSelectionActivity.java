package com.example.colby.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginTypeSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_type_selection);
    }

    public void signupIndividual(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void signupOrganization(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

}
