package com.example.myapplication.actividades.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.entidades.MyAlertDialog;
import com.example.myapplication.entidades.MyDatePicker;
import com.example.myapplication.entidades.persona.Entrenador;

public class PerfilUsuarioActivity extends AppCompatActivity {

    TextView tvName, tvlName, tvCell, tvEmail, tvAge;
    AlertDialog dialog;
    Entrenador e;
    EditText etName, etlName, etCell, etEmail, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvName = findViewById(R.id.tvNameUser);
        tvlName = findViewById(R.id.tvLNameUser);
        tvCell = findViewById(R.id.tvCellUser);
        tvEmail = findViewById(R.id.tvEmailUser);
        tvAge = findViewById(R.id.tvAgeUser);


        e = new Entrenador("Alberto", "Rodriguez", 930448002, "arodriguez@gmail.com", 24, "test");

        tvName.setText(e.getNombre());
        tvlName.setText(e.getApellido());
        //tvCell.setText((int) e.getCelular());
        tvEmail.setText(e.getCorreo());
        //tvAge.setText(e.getEdad());

        MyAlertDialog a = new MyAlertDialog(this, etName, tvName, dialog);
        MyAlertDialog b = new MyAlertDialog(this, etlName, tvlName, dialog);
        MyAlertDialog c = new MyAlertDialog(this, etCell, tvCell, dialog);
        MyAlertDialog d = new MyAlertDialog(this, etEmail, tvEmail, dialog);
        MyAlertDialog e = new MyAlertDialog(this, etAge, tvAge, dialog);

    }

}
