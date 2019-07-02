package com.example.myapplication.entidades;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;


public class MyDatePicker implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private int actualDay, actualMonth, actualYear;
    private int mDay, mMonth, mYear;
    private EditText mEditText;
    private Context mContext;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setmDay(int mDay) {
        this.mDay = mDay;
    }

    public void setmMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }

    public int getmDay() {
        return mDay;
    }

    public int getmMonth() {
        return mMonth;
    }

    public int getmYear() {
        return mYear;
    }

    public int getActualDay() {
        return actualDay;
    }

    public void setActualDay(int actualDay) {
        this.actualDay = actualDay;
    }

    public int getActualMonth() {
        return actualMonth;
    }

    public void setActualMonth(int actualMonth) {
        this.actualMonth = actualMonth;
    }

    public int getActualYear() {
        return actualYear;
    }

    public void setActualYear(int actualYear) {
        this.actualYear = actualYear;
    }

    public EditText getmEditText() {
        return mEditText;
    }

    public MyDatePicker(Context context, int editTextId){
        Activity act = (Activity) context;
        this.mEditText = act.findViewById(editTextId);
        this.mEditText.setOnClickListener(this);
        this.mContext = context;
    }



    public int getAge(){
        if (getmDay() == 0 || getmMonth() == 0 || getmYear() == 0){
            int age = getActualYear() - getmYear();
            int diffMonth = getActualMonth() - getmMonth();
            int diffDay = getActualDay() - getmDay();
            if (diffMonth<0 || (diffMonth==0 && diffDay<0))
                return age-1;
            else
                return age;
        }else {
            return 0;
        }

    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {

        setmDay(dayOfMonth);
        setmMonth(month);
        setmYear(year);

        String d = "";

        if (dayOfMonth<10 && month<10){
            d = "0"+dayOfMonth+"/0"+(month+1)+"/"+year;
            mEditText.setText(d);
            setDate(d);
        } else if (dayOfMonth>9 && month>9){
            d = dayOfMonth+"/"+(month+1)+"/"+year;
            mEditText.setText(d);
            setDate(d);
        } else if (dayOfMonth<10 && month>9){
            d = "0"+dayOfMonth+"/"+(month+1)+"/"+year;
            mEditText.setText(d);
            setDate(d);
        } else if (dayOfMonth>9 && month<10) {
            d = dayOfMonth+"/0"+(month+1)+"/"+year;
            mEditText.setText(d);
            setDate(d);
        }

    }

    @Override
    public void onClick(View v) {
        Calendar c = Calendar.getInstance();

        actualDay = c.get(Calendar.DAY_OF_MONTH);
        actualMonth = c.get(Calendar.MONTH);
        actualYear = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(mContext, this, actualDay, actualMonth, actualYear);
        datePickerDialog.show();

    }
}
