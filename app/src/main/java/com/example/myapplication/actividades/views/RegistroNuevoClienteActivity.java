package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.entidades.MyDatePicker;

public class RegistroNuevoClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText nClientName = findViewById(R.id.etClientName);
        EditText nClientLName = findViewById(R.id.etClientLName);
        EditText nClientAge = findViewById(R.id.etClientAge);
        EditText nClientCell = findViewById(R.id.etClientCell);
        EditText nClientEmail = findViewById(R.id.etClientEmail);
        EditText nClientWght = findViewById(R.id.etClientWght);
        EditText nClientSize = findViewById(R.id.etClientSize);
        EditText nClientObj = findViewById(R.id.etClientObj);
        CheckBox nClientDoSprt = findViewById(R.id.cbClientDoSprt);

        MyDatePicker myDatePicker = new MyDatePicker(this, R.id.etClientAge);

    }



}
