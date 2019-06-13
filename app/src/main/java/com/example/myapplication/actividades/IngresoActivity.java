package com.example.myapplication.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.actividades.views.HomeActivity;
import com.example.myapplication.actividades.views.RegistroActivity;

public class IngresoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText etUsuario = findViewById(R.id.et_usuario);
        EditText etContra = findViewById(R.id.et_contraseña);

    }

    public void goRegistarse(View v){
        Intent intentRe = new Intent(this, RegistroActivity.class);
        startActivity(intentRe);
    }


    public void goHome(View v){
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }

}
