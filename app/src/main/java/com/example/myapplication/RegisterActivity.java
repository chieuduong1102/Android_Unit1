package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView txtUsernameR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent intent = getIntent();
        String username = intent.getStringExtra("txtUsername");
        txtUsernameR = findViewById(R.id.ra_txtUsername);

        txtUsernameR.setText(username);


    }
}