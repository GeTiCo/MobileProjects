package com.example.coffeemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  int mon(){
        int check = 0;
        Random rnd = new Random();
        while(true){
            check = rnd.nextInt((250 - 0) - 0);
            if(check % 10 == 0){
                break;
            }
        }

        return check;
    }
    public void start(View view){
        int[] numbers = new int[]{ 40, 50, 60, 70, 100 };
        int res = 0;
        int check = mon();

        TextView result = findViewById(R.id.textView6);
        TextView money = findViewById(R.id.textView5);

        money.setText("Вы внесли: " + check + " рублей");

        RadioButton r1 = findViewById(R.id.radioButton);
        RadioButton r2 = findViewById(R.id.radioButton2);
        RadioButton r3 = findViewById(R.id.radioButton3);
        RadioButton r4 = findViewById(R.id.radioButton4);
        RadioButton r5 = findViewById(R.id.radioButton5);

        if(r1.isChecked() == true || r2.isChecked() == true || r3.isChecked() == true || r4.isChecked() == true || r5.isChecked() == true){
            if(r1.isChecked() == true){
                res = check - numbers[0];
                if(res >= 0){
                    result.setText("Ваш Капучино готов\nВаша сдача " +res+ "рублей");
                }
                else{
                    result.setText("Недостаточно средств");
                }
            }
            if(r2.isChecked() == true){
                res = check - numbers[1];
                if(res >= 0){
                    result.setText("Ваш Экспрессо готов\nВаша сдача " +res+ "рублей");
                }
                else{
                    result.setText("Недостаточно средств");
                }
            }
            if(r3.isChecked() == true){
                res = check - numbers[2];
                if(res >= 0){
                    result.setText("Ваш Американо готов\nВаша сдача " +res+ "рублей");
                }
                else{
                    result.setText("Недостаточно средств");
                }
            }
            if(r4.isChecked() == true){
                res = check - numbers[3];
                if(res >= 0){
                    result.setText("Ваш Латте готов\nВаша сдача " +res+ "рублей");
                }
                else{
                    result.setText("Недостаточно средств");
                }
            }
            if(r5.isChecked() == true){
                res = check - numbers[4];
                if(res >= 0){
                    result.setText("Ваш Рисретто готов\nВаша сдача " +res+ "рублей");
                }
                else{
                    result.setText("Недостаточно средств");
                }
            }
        }

    }
}