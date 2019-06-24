package com.example.myapplication.actividades.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this, RegistroNuevoClienteActivity.class));

                Snackbar.make(view, "Nuevo cliente agregado", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    public void goDias(View v){
        Intent intentDias = new Intent(this, DiasActivity.class);
        startActivity(intentDias);
    }

    public void goClientes(View v){
        Intent intentCl = new Intent(this, ListaClienteActivity.class);
        startActivity(intentCl);
    }


}
