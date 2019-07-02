package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.entidades.MyAlertDialog;


public class PerfilClienteActivity extends AppCompatActivity {

    EditText etClientName, etClientLn, etClientObj, etClientCell,
            etClientEmail, etClientSize, etClientWght,
            etClientAge, etClientState;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tvClientName = findViewById(R.id.tvpClientName);
        ImageView imClientImg = findViewById(R.id.tvpClientIm);
        TextView tvClientLn = findViewById(R.id.tvpClientLn);
        TextView tvClientCell = findViewById(R.id.tvpClientCell);
        TextView tvClientEmail = findViewById(R.id.tvpClientEmail);
        TextView tvClientSize = findViewById(R.id.tvpClientSize);
        TextView tvClientWght = findViewById(R.id.tvpClientWght);
        TextView tvClientObj = findViewById(R.id.tvpClientObj);
        TextView tvClientAge = findViewById(R.id.tvpClientAge);
        TextView tvClientState = findViewById(R.id.tvpClientState);

        MyAlertDialog a = new MyAlertDialog(this, etClientName, tvClientName, dialog);
        MyAlertDialog b = new MyAlertDialog(this, etClientLn, tvClientLn, dialog);
        MyAlertDialog c = new MyAlertDialog(this, etClientObj, tvClientObj, dialog);
        MyAlertDialog d = new MyAlertDialog(this, etClientCell, tvClientCell, dialog);
        MyAlertDialog e = new MyAlertDialog(this, etClientEmail, tvClientEmail, dialog);
        MyAlertDialog f = new MyAlertDialog(this, etClientSize, tvClientSize, dialog);
        MyAlertDialog g = new MyAlertDialog(this, etClientWght, tvClientWght, dialog);
        MyAlertDialog h = new MyAlertDialog(this, etClientAge, tvClientAge, dialog);
        MyAlertDialog i = new MyAlertDialog(this, etClientState, tvClientState, dialog);

        int imClient = 0;
        String nClient = "";
        int ageClient = 0;
        String objClient = "";
        String lnClient = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            imClient = (int) extras.get("clientImage");
            nClient = extras.getString("clientName");
            //ageClient = (int) extras.get("clientAge");
            objClient = extras.getString("clientObj");
            lnClient = extras.getString("clientLname");
        }

        imClientImg.setImageResource(imClient);
        tvClientName.setText(nClient);
        tvClientObj.setText(objClient);
        tvClientLn.setText(lnClient);
        //tvClientAge.setText(ageClient);

    }

}
