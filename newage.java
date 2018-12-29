package com.example.parth.agecalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class newage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newage);
        String s=getIntent().getExtras().getString("key");

        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = df.format(c);
        String s1=formattedDate.toString();
        String s2=s1.substring(6,10);
        String s3=s.substring(6,10);
        int a=Integer.valueOf(s2);
        int b=Integer.valueOf(s3);
        int d=(a-b)*52;
        Toast.makeText(getApplicationContext(), "number of weeks lived " +d, Toast.LENGTH_SHORT).show();

    }
}
