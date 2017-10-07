package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

    }
    public void Login(View view) {
        Intent intent = new Intent(this, IncomeExpense.class);
        startActivity(intent);
    }
    public void Register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
