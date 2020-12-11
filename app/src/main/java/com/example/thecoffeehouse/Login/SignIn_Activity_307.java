package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity_307;
import com.example.thecoffeehouse.R;

public class SignIn_Activity_307 extends AppCompatActivity {

    Button signin_307;
    EditText edtemail_307, edtpassword_307;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_307);

        edtemail_307=(EditText) findViewById(R.id.edtEmail_307);
        edtpassword_307=(EditText) findViewById(R.id.edtPassword_307);
        signin_307=(Button) findViewById(R.id.btn_signin_307);
        signin_307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtemail_307.getText().length() != 0 && edtpassword_307.getText().length() != 0) {
            if (edtemail_307.getText().toString().equals("1811505310307") && edtpassword_307.getText().toString().equals("tuandung")) {
                Toast.makeText(SignIn_Activity_307.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity_307.this, MainActivity_307.class);
                startActivity(intent);

            } else {
                Toast.makeText(SignIn_Activity_307.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity_307.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }
}