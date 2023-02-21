package com.example.googlelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.googlelogin.R.id;

public class emailLogin extends AppCompatActivity {
    EditText Etext;
    Button emailButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        Etext =(EditText) findViewById(R.id.Etext);

        emailButton = (Button) findViewById(id.button);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Etext.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "blank field can not b proccessed", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(emailLogin.this, GetOtpInEMail.class);
                    startActivity(intent);
                }
            }
        });

    }
}