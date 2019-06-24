package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.example.myapplication.R;
import com.example.myapplication.entidades.MyDatePicker;
import com.example.myapplication.entidades.MyTimePicker;

public class CitaActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cita);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyDatePicker myDatePicker = new MyDatePicker(this, R.id.etDatePicker);
        MyTimePicker myTimePicker = new MyTimePicker(this, R.id.etTimePicker);
    }

}
