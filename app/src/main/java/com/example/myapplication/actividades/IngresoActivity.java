package com.example.myapplication.actividades;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.actividades.views.HomeActivity;
import com.example.myapplication.actividades.views.RegistroUsuarioActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class IngresoActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsuario,etContra;
    Button registrarse, ingresar;
    ProgressDialog progresd;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        firebaseAuth=FirebaseAuth.getInstance();
        progresd= new ProgressDialog((this));
        etUsuario = findViewById(R.id.et_usuario);
        etContra = findViewById(R.id.et_contraseña);

        registrarse = findViewById(R.id.btn_registrar);
        ingresar = findViewById(R.id.btn_ingresar);

        ingresar.setOnClickListener(this);

    }

    public void goRegistarse(View v){
        Intent intentRe = new Intent(this, RegistroUsuarioActivity.class);
        startActivity(intentRe);
    }


    public void goHome(View v){
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }

    private void LoginUser(){
        String emailing = etUsuario.getText().toString().trim();
        String passwording=etContra.getText().toString().trim();
        if(TextUtils.isEmpty(emailing))
        {
            Toast.makeText(this, "Ingrese su Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(passwording))
        {
            Toast.makeText(this, "Ingrese su contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        progresd.setMessage("Ingresando usuario..");
        progresd.show();

        firebaseAuth.signInWithEmailAndPassword(emailing,passwording)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            progresd.hide();
                            Toast.makeText(IngresoActivity.this, "Ingreso exitoso", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(IngresoActivity.this,HomeActivity.class));
                        }
                        else{
                            progresd.hide();
                            Toast.makeText(IngresoActivity.this, "No se pudo Ingresar", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    public void onClick(View v) {
        if (v == ingresar) {
            LoginUser();
        }
    }
}
