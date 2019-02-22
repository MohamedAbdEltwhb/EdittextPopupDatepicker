package com.example.mm.edittextpopupdatepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    EditText edittext;

    EditText date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext= findViewById(R.id.Birthday);
        new DateInputMask(edittext);




        //dateF.newv(edittext, this);

        date = (EditText)findViewById(R.id.whichdate);
        date.addTextChangedListener(new DateTextWatcher());
    }




}
