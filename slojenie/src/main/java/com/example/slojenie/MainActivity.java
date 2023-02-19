package com.example.slojenie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){
        EditText firstNumber = findViewById(R.id.editTextTextPersonName);
        EditText secondNumber = findViewById(R.id.editTextTextPersonName2);
        TextView result = findViewById(R.id.result);

        if((firstNumber.getText().toString(). trim(). equals("")) || (secondNumber.getText().toString(). trim(). equals(""))){
            Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();
        }
        else{
            String firstNum = firstNumber.getText().toString();
            String secondNum = firstNumber.getText().toString();

            try {
                double FN = Double.parseDouble(firstNum);
                double SN = Double.parseDouble(secondNum);

                double r = FN + SN;

                String res = Double.toString(r);
                result.setText(res);
            }
            catch (NumberFormatException e){
                Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();
            }
        }
    }
}