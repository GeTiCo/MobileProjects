package com.example.array1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void btnClick(View view){

        TextView resulter1 = findViewById(R.id.textView3);
        resulter1.setText("");

        Random rnd = new Random();

        int sum = 0;
        int maxchet = 0;

        int kol = 100;

        int[] array = new  int[kol];

        for (int i = 0; i <= array.length - 1; i++){
            int res = rnd.nextInt((100 - 1) + 1);
            array[i] = res;
            sum += res;
            if((i % 2 == 0) && (res >= maxchet)){
                maxchet = res;
            }
            resulter1.append(array[i] + " ");
        }

        TextView resulter2 = findViewById(R.id.infoText);
        resulter2.setText("Сумма: " + sum);

        TextView resulter3 = findViewById(R.id.textView2);
        resulter3.setText("Макс.чет: " + maxchet);
    }
}