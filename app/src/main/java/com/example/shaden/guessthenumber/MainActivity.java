package com.example.shaden.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText input;
    int c;
    TextView tNumber;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(EditText)findViewById(R.id.editText);
        tNumber=(TextView)findViewById(R.id.textViewNumber);
    }

    public void getRandom(View v){
        Random rand = new Random();

        c = rand.nextInt(30);

    }

    public void Guessed(View v){

      String s=input.getText().toString();
        int a= Integer.valueOf(s);
       


        if(a==c){
            Toast.makeText(getApplicationContext(),"you have gussed the number!",Toast.LENGTH_LONG).show();

            tNumber.setText("You guessed after "+String.valueOf(counter)+" times");

        }
        else if(a<c){
            counter++;

                Toast.makeText(getApplicationContext(),"the number is greater..",Toast.LENGTH_LONG).show();
            }


        else if(a>c){
            counter++;

                Toast.makeText(getApplicationContext(),"the number is smaller..",Toast.LENGTH_LONG).show();

        }
    }
}
