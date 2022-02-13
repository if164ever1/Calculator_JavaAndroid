package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    double result;
    Button one, two, three, four, fifth, six, seven, eight, nine, zero, plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.viewResult);
        SetButtonsLister();


    }


    @Override
    public void onClick(View view) {
        Button button = (Button)view;
        switch (button.getId()){
            case R.id.btnOne:
                textView.append(button.getText());
                break;
            case R.id.btnTwo:
                textView.append(button.getText());
                break;
            case R.id.btnPlus:





        }

        //onNumberClick(view);
    }



    public void onNumberClick(View view){
        Button button = (Button)view;
        textView.append(button.getText());
        result = Integer.parseInt(textView.getText().toString());
    }

    private void SetButtonsLister(){
        one = findViewById(R.id.btnOne);
        one.setOnClickListener(this);
        two = findViewById(R.id.btnTwo);
        two.setOnClickListener(this);
        three = findViewById(R.id.btnThree);
        three.setOnClickListener(this);
        four = findViewById(R.id.btnFour);
        four.setOnClickListener(this);
        fifth = findViewById(R.id.btnFifth);
        fifth.setOnClickListener(this);
        six = findViewById(R.id.btnSix);
        six.setOnClickListener(this);
        seven = findViewById(R.id.btnSeven);
        seven.setOnClickListener(this);
        eight = findViewById(R.id.btnEight);
        eight.setOnClickListener(this);
        nine = findViewById(R.id.btnNine);
        nine.setOnClickListener(this);
        zero = findViewById(R.id.btnZero);
        zero.setOnClickListener(this);

        plus = findViewById(R.id.btnPlus);
        plus.setOnClickListener(this);

    }
}

