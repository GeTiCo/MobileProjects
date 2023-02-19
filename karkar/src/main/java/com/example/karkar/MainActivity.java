package com.example.karkar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        Random random = new Random();
        int var = random.nextInt((100 - 1) + 1);

        CheckBox red = findViewById(R.id.checkBox);
        CheckBox bold = findViewById(R.id.checkBox2);
        CheckBox kursiv = findViewById(R.id.checkBox3);

        EditText info = findViewById(R.id.editTextTextPersonName);

        if(red.isChecked()){
            info.setTextColor(Color.RED);
        }
        else{
            info.setTextColor(Color.WHITE);
        }

        if(bold.isChecked() || kursiv.isChecked()){
            if(bold.isChecked()){
                info.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
            if(kursiv.isChecked()){
                info.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            }
            if(bold.isChecked() && kursiv.isChecked()){
                info.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
            }
        }
        else{
            info.setTypeface(Typeface.DEFAULT);
        }

        info.setText("Я насчитал " + var + " ворон");
    }
}