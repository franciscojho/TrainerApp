package com.example.myapplication.actividades.views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class PerfilClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        int imClient = 0;
        String nClient = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            imClient = (int) extras.get("clientImage");
            nClient = extras.getString("clientName");
        }
        TextView tvClientName = findViewById(R.id.tvClientName);
        ImageView imClientImg = findViewById(R.id.imClientImage);
        imClientImg.setImageResource(imClient);
        tvClientName.setText(nClient);
    }

}
