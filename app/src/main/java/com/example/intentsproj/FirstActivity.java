package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
   // TextView txtMessage;
    //String myExtra = "Text";

    public String no1;
    public String no2;
    EditText text1, text2;
    int numb1,numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn = findViewById(R.id.btnOn);
        //txtMessage =findViewById(R.id.txtName);


        text1= (EditText)findViewById(R.id.number1);
        text2= (EditText)findViewById(R.id.number2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = text1.getText().toString();
                no2 = text2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("MAIN_EXTRA1",no1);
                intent.putExtra("MAIN_EXTRA1",no2);

                startActivity(intent);

                Context context = getApplicationContext();
                //The context to use. Usually your Application or Activity object
                 CharSequence message = "You just clicked the OK button";
                // Display string
                int duration = Toast.LENGTH_SHORT;
                //How long the toast message will lasts

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            }
        });

    }

    /*@Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("MAIN_EXTRA",myExtra);
                startActivity(intent);
            }
        });
    }*/
}