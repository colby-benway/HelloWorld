package com.example.colby.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MatthewGalan2 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matthew_galan2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                openActivity1();
            }
        });
    }

    public void openActivity1() {
        Intent intent = new Intent(this, MatthewGalan.class);
        startActivity(intent);
    }
}
