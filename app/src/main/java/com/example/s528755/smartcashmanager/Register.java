package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Register(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Successfully Registered ", Toast.LENGTH_LONG).show();
    }
}
