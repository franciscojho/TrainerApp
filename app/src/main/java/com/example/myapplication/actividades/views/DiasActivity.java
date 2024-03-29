package com.example.myapplication.actividades.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DiasActivity.this, CitaActivity.class));
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


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
