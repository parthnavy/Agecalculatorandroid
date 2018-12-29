package com.example.parth.agecalculation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText e;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editText);
    }

    public void checkweeks(View view) {
        String s;
        s=e.getText().toString();

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // here set the pattern as you date in string was containing like date/month/year
            Date d = sdf.parse(s);
            Intent intent=new Intent(this, newage.class);
            intent.putExtra("key",s);
            startActivity(intent);
        }catch(ParseException ex){
            Context context = getApplicationContext();
            CharSequence text = "Enter date as dd/mm/yyyy only";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            // handle parsing exception if date string was different from the pattern applying into the SimpleDateFormat contructor
        }
    }
}