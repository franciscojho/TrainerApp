package com.example.myapplication.actividades.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.R;

public class RegistroUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText etUsuario = findViewById(R.id.et_usuario);
        EditText etNom = findViewById(R.id.et_nombres);
        EditText etApe = findViewById(R.id.et_apellidos);
        EditText etNac = findViewById(R.id.et_nacimiento);
        EditText etCel = findViewById(R.id.et_celular);
        EditText etEmail = findViewById(R.id.et_email);
        EditText etcontra = findViewById(R.id.et_contraseña);
    }

    public void goHome(View v){
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }

}
