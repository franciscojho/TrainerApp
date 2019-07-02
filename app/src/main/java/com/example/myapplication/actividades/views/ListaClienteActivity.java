package com.example.myapplication.actividades.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.actividades.adapters.AdaptadorClientes;
import com.example.myapplication.entidades.MyDatePicker;
import com.example.myapplication.entidades.persona.Cliente;

import java.util.ArrayList;

public class ListaClienteActivity extends AppCompatActivity{

    private static final String TAG = "ClientActivity";

    ArrayList<Cliente> arrayClients = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d(TAG, "onCreate: started.");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaClienteActivity.this, RegistroNuevoClienteActivity.class));
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initClients();
    }

    private void initClients(){
        Log.d(TAG, "initClients: preparando clientes");
        Cliente c1 = new Cliente("Lee", "Sin", 940361884, "lsin@hotmail.com", 20,
                1.80, 80, "Tener una vida sana", false, R.drawable.defaultimage);
        Cliente c2 = new Cliente("Roberto", "Triste", 940361504, "rtriste@hotmail.com", 23,
                1.78, 75, "Bajar de peso", false, R.drawable.defaultimage);
        Cliente c3 = new Cliente("Rolando", "Castro", 940361504, "rcastro@hotmail.com", 24,
                1.74, 70, "Vivir feliz", false, R.drawable.defaultimage);
        Cliente c4 = new Cliente("Felipe", "Vivaz", 930883504, "fvivas@hotmail.com", 18,
                1.67, 59, "Aumentar masa muscular", false, R.drawable.defaultimage);
        Cliente c5 = new Cliente("Yasuo", "Manco", 934504555, "myasuo@hotmail.com", 33,
                1.70, 69, "Correr más rápido", false, R.drawable.defaultimage);
        Cliente c6 = new Cliente("Miranda", "Miroquesada", 900233994, "mmiroque@hotmail.com", 22,
                1.70, 69, "Bajar de peso", false, R.drawable.defaultimage);
        Cliente c7 = new Cliente("Julia", "Maravilla", 913004050, "mjulia@hotmail.com", 25,
                1.70, 69, "Ser más ágil", false, R.drawable.defaultimage);

        arrayClients.add(c1);
        arrayClients.add(c2);
        arrayClients.add(c3);
        arrayClients.add(c4);
        arrayClients.add(c5);
        arrayClients.add(c6);
        arrayClients.add(c7);
        initRecyclerView();

    }
    
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: iniciando recyclerview");
        final RecyclerView recyclerView = findViewById(R.id.recycler_clients);
        AdaptadorClientes adapter = new AdaptadorClientes(this, arrayClients);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
