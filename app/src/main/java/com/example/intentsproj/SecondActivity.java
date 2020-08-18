package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button b1,b2,b3,b4;
    TextView cal;
    EditText n1,n2;

    float result;
    int numb1,numb2;
    String str1,str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Intent myIntent = getIntent();
        //takeExtra = myIntent.getStringExtra("MAIN_EXTRA");

        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);

        cal = findViewById(R.id.calanswer);

        n1 = (EditText)findViewById(R.id.number1);
        n2 = (EditText)findViewById(R.id.number2);

        Intent intent = getIntent();
        str1 = intent.getStringExtra("MAIN_EXTRA1");
        str2 = intent.getStringExtra("MAIN_EXTRA2");

        n1.setText(str1);
        n2.setText(str2);

        numb1 = Integer.parseInt(str1);
        numb2 = Integer.parseInt(str2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result= numb1 + numb2;

                cal.setText(String.valueOf(result));

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result= numb1 / numb2;

                cal.setText(String.valueOf(result));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result= numb1 - numb2;

                cal.setText(String.valueOf(result));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result= numb1 * numb2;

                cal.setText(String.valueOf(result));

            }
        });
    }

}