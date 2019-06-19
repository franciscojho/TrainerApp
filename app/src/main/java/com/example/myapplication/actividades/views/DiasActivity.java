package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapplication.R;
import java.util.ArrayList;

public class DiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dias);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> daysArray = new ArrayList<>();

        daysArray.add("Lunes");
        daysArray.add("Martes");
        daysArray.add("Miércoles");
        daysArray.add("Jueves");
        daysArray.add("Viernes");
        daysArray.add("Sábado");
        daysArray.add("Domingo");

        ListView listaDias = findViewById(R.id.lv_dias);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, daysArray);
        listaDias.setAdapter(adaptador);

    }

}
