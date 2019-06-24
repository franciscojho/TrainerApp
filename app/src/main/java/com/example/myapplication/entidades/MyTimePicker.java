package com.example.myapplication.entidades;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class MyTimePicker implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    private int nHours, nMinutes;
    private EditText nEditText;
    private Context nContext;

    public int getnHours() {
        return nHours;
    }

    public void setnHours(int nHours) {
        this.nHours = nHours;
    }

    public int getnMinutes() {
        return nMinutes;
    }

    public void setnMinutes(int nMinutes) {
        this.nMinutes = nMinutes;
    }

    public EditText getnEditText() {
        return nEditText;
    }

    public MyTimePicker(Context context, int editTextId){
        Activity act = (Activity) context;
        this.nEditText = act.findViewById(editTextId);
        this.nEditText.setOnClickListener(this);
        this.nContext = context;
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        if (hourOfDay<10 && minute<10)
           nEditText.setText("0"+hourOfDay+":0"+minute);
        else if (hourOfDay>9 && minute>9)
            nEditText.setText(hourOfDay+":0"+minute);
        else if (hourOfDay<10 && minute >9)
            nEditText.setText("0"+hourOfDay+":"+minute);
        else if (hourOfDay>9 && minute<10)
            nEditText.setText(hourOfDay+":"+minute);
    }

    @Override
    public void onClick(View v) {
        Calendar c = Calendar.getInstance();

        nHours = c.get(Calendar.HOUR_OF_DAY);
        nMinutes = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(nContext, this, nHours, nMinutes, false);
        timePickerDialog.show();
    }
}
