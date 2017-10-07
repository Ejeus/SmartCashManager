package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Reports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

    }
    public void Income(View view) {
        Intent intent = new Intent(this, IncomeReports.class);
        startActivity(intent);
    }
    public void Expense(View view) {
        Intent intent = new Intent(this, ExpenseReports.class);
        startActivity(intent);
    }
    public void IE(View view) {
        Intent intent = new Intent(this, IncomeExpenseReports.class);
        startActivity(intent);
    }


}
