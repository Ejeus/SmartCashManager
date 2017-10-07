package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Income extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
    }
    public void Submit(View view) {
        Intent intent = new Intent(this, IncomeExpense.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Income Added " , Toast.LENGTH_LONG).show();
    }
}
