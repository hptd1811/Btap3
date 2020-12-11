package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

public class Login_307 extends AppCompatActivity {

    Button signin_318, signup_318;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_307);
        signin_318 = findViewById(R.id.btn_signin_307);
        signup_318 = findViewById(R.id.btnSignUp_307);

        signin_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_307.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login_307.this, SignIn_Activity_307.class);
                startActivity(intent);

            }
        });

        signup_318.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login_307.this, SignUp_Activity_307.class);
                startActivity(intent);

            }
        });

    }
}