package com.example.myapplication.actividades.views;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistroUsuarioActivity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    Button registar;
    ProgressDialog progresd;
    EditText etNom, etApe, etNac, etCel, etEmail, etContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progresd = new ProgressDialog((this));
        firebaseAuth = FirebaseAuth.getInstance();
        registar = findViewById(R.id.btn_registrar);

        etNom = findViewById(R.id.et_nombres);
        etApe = findViewById(R.id.et_apellidos);
        etNac = findViewById(R.id.et_nacimiento);
        etCel = findViewById(R.id.et_celular);
        etEmail = findViewById(R.id.et_email);
        etContra = findViewById(R.id.et_contraseña);

        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nombre = etNom.getText().toString();
                final String apellido = etApe.getText().toString();
                final String fecnacimiento = etNac.getText().toString();
                final String celular = etCel.getText().toString();
                final String email = etEmail.getText().toString();
                final String contra = etContra.getText().toString();

                if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || contra.isEmpty()) {
                    Toast.makeText(RegistroUsuarioActivity.this, "Llene todos los datos", Toast.LENGTH_SHORT).show();
                } else {
                    RegisterUser(email, contra);
                }

            }
        });

    }

    private void RegisterUser(String email, String contra) {

        progresd.setMessage("Regisrando usuario..");
        progresd.show();

        firebaseAuth.createUserWithEmailAndPassword (email, contra)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progresd.hide();
                            Toast.makeText(RegistroUsuarioActivity.this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
                        } else {
                            progresd.hide();
                            Toast.makeText(RegistroUsuarioActivity.this, "No se pudo registrar", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }


    /*public void goHome(View v){
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
    }*/

}
