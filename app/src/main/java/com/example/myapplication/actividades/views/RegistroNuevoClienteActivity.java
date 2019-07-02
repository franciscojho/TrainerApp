package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.entidades.MyDatePicker;
import com.example.myapplication.entidades.persona.Cliente;

public class RegistroNuevoClienteActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nClientName, nClientLName, nClientCell,
            nClientEmail, nClientWght, nClientSize, nClientObj;
    CheckBox nClientDoSprt;
    MyDatePicker nClientAge;
    Button newClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nClientName = findViewById(R.id.etClientName);
        nClientLName = findViewById(R.id.etClientLName);
        nClientAge = new MyDatePicker(this, R.id.etClientAge);
        nClientCell = findViewById(R.id.etClientCell);
        nClientEmail = findViewById(R.id.etClientEmail);
        nClientWght = findViewById(R.id.etClientWght);
        nClientSize = findViewById(R.id.etClientSize);
        nClientObj = findViewById(R.id.etClientObj);
        nClientDoSprt = findViewById(R.id.cbClientDoSprt);


        newClient = findViewById(R.id.btn_registrarCliente);
        newClient.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String name = nClientName.getText().toString();
        String lname = nClientLName.getText().toString();
        String bdate = nClientAge.getDate();
        long cell = Long.parseLong(nClientCell.getText().toString());
        String email = nClientEmail.getText().toString();
        double weight = Double.parseDouble(nClientWght.getText().toString());
        double size = Double.parseDouble(nClientSize.getText().toString());
        String objetive = nClientObj.getText().toString();
        Boolean doSports = nClientDoSprt.isChecked();
        int image = R.drawable.defaultimage;


    }
}
