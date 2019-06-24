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
        Cliente c1 = new Cliente("Francisco", "Huapaya", 940361504, "franciscojho@hotmail.com", 26,
                1.78, 76, "Tener una vida sana", false, R.drawable.defaultimage);
        Cliente c2 = new Cliente("Roberto", "Huapaya", 940361504, "franciscojho@hotmail.com", 25,
                1.78, 76, "Tener una vida sana", false, R.drawable.defaultimage);
        Cliente c3 = new Cliente("Rolando", "Huapaya", 940361504, "franciscojho@hotmail.com", 40,
                1.78, 76, "Tener una vida sana", false, R.drawable.defaultimage);
        Cliente c4 = new Cliente("Juan", "Huapaya", 940361504, "franciscojho@hotmail.com", 18,
                1.78, 76, "Tener una vida sana", false, R.drawable.defaultimage);
        Cliente c5 = new Cliente("Ricardo", "Huapaya", 940361504, "franciscojho@hotmail.com", 20,
                1.78, 76, "Tener una vida sana", false, R.drawable.defaultimage);
        
        arrayClients.add(c1);
        arrayClients.add(c2);
        arrayClients.add(c3);
        arrayClients.add(c4);
        arrayClients.add(c5);

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
