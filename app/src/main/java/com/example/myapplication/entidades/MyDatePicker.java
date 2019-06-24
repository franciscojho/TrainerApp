package com.example.myapplication.entidades;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;


public class MyDatePicker implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private  int mDay, mMonth, mYear;
    private EditText mEditText;
    private Context mContext;

    public int getmDay() {
        return mDay;
    }

    public void setmDay(int mDay) {
        this.mDay = mDay;
    }

    public int getmMonth() {
        return mMonth;
    }

    public void setmMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
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
        Calendar rightNow = Calendar.getInstance();
        int age = rightNow.get(Calendar.YEAR) - getmYear();
        if (getmMonth()>=rightNow.get(Calendar.MONTH) && getmDay()>=rightNow.get(Calendar.DAY_OF_MONTH))
            return age;
        else
            return age-1;
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        if (dayOfMonth<10 && month<10)
            mEditText.setText("0"+dayOfMonth+"/0"+month+"/"+year);
        else if (dayOfMonth>9 && month>9)
            mEditText.setText(dayOfMonth+"/"+month+"/"+year);
        else if (dayOfMonth<10 && month >9)
            mEditText.setText("0"+dayOfMonth+"/"+month+"/"+year);
        else if (dayOfMonth>9 && month<10)
            mEditText.setText(dayOfMonth+"/0"+month+"/"+year);
    }

    @Override
    public void onClick(View v) {
        Calendar c = Calendar.getInstance();

        mDay = c.get(Calendar.DAY_OF_MONTH);
        mMonth = c.get(Calendar.MONTH)+1;
        mYear = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(mContext, this, mDay, mMonth, mYear);
        datePickerDialog.show();

    }
}
