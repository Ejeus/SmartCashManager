package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Expense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
    }
    public void Submit(View view) {
        Intent intent = new Intent(this, IncomeExpense.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Expense Added " , Toast.LENGTH_LONG).show();
    }
    public void Image(View view) {
Toast.makeText(getApplicationContext(), "Not Implemented yet ", Toast.LENGTH_LONG).show();
    }
}
