package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    Button btnLogin, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.am_username);
        txtPassword = findViewById(R.id.am_password);
        btnLogin = findViewById(R.id.am_btnLogin);
        btnRegister = findViewById(R.id.am_btnRegister);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(MainActivity.class.getName(), "onClick btnLogin");
                String username = txtUsername.getText().toString();
                String pwd = txtPassword.getText().toString();

                Toast.makeText(MainActivity.this, username, Toast.LENGTH_SHORT).show();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                i.putExtra("txtUsername",txtUsername.getText().toString());
                startActivity(i);
            }
        });
    }
}