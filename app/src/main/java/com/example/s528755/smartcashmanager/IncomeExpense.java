package com.example.s528755.smartcashmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IncomeExpense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_expense);
    }
    //Add expense
    public void Expense(View view) {
        Intent intent = new Intent(this, Expense.class);
        startActivity(intent);}
    //Add Income
    public void Income(View view) {
        Intent intent = new Intent(this, Income.class);
        startActivity(intent);}

    //Add Income
    public void Reports(View view) {
        Intent intent = new Intent(this, Reports.class);
        startActivity(intent);}
    //Logout
    public void Logout(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
