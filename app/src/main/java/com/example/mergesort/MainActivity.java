package com.example.mergesort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private int answer;
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);

    }



    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        int n = Integer.parseInt(currValue);
        String answ = Integer.toString(answer);
        this.answerTV.setText(answ);


    }

    private int fact(int n) {
        if (n <= 1)
            return answer = 1;
        else
            return answer = n * fact(n-1);
    }


}