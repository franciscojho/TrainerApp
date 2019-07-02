package com.example.myapplication.entidades;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyAlertDialog implements View.OnClickListener {

    private Activity act;
    private TextView mTextView;
    private AlertDialog dialog;
    private EditText mEditText;

    public TextView getmTextView() {
        return mTextView;
    }

    public AlertDialog getDialog() {
        return dialog;
    }

    public EditText getmEditText() {
        return mEditText;
    }

    public MyAlertDialog(Context context, EditText mEditText, TextView mTextView, AlertDialog dialog) {
        Activity act = (Activity)context;
        this.mTextView = mTextView;
        this.mEditText = new EditText(act);
        this.dialog = new AlertDialog.Builder(act).create();
        this.dialog.setTitle("Editar Info");
        this.dialog.setView(this.mEditText);
        this.BuildDialog();
        mTextView.setOnClickListener(this);
    }

    public void BuildDialog(){
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Guardar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mTextView.setText(mEditText.getText());
            }
        });
    }

    @Override
    public void onClick(View v) {
        mEditText.setText(mTextView.getText());
        dialog.show();
    }
}
