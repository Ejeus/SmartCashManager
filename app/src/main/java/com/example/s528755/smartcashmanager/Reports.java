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
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        String[] items = new String[]{"Select type of report","Income Reports", "Expense Reports"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spin.setAdapter(adapter);

    }
    public void Income(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    public void Expense(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    public void IE(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }


}
