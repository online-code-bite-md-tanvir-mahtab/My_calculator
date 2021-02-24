package com.tanvircodder.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mAnswerView;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nwo i am inisializing the view..//
        mAnswerView = (EditText) findViewById(R.id.answer_of_the_calculation);

    }
    public void onOne(View view){
        Toast.makeText(this,"One",Toast.LENGTH_LONG).show();
        mAnswerView.setText(mAnswerView.getText()+"1");

    }
    public void onTwo(View view){
        mAnswerView.setText(mAnswerView.getText()+"2");
    }
    public void onThree(View view){
        mAnswerView.setText(mAnswerView.getText()+"3");
    }
    public void onFour(View view){
        mAnswerView.setText(mAnswerView.getText()+"4");
    }
    public void onFive(View view){
        mAnswerView.setText(mAnswerView.getText()+"5");

    }
    public void onSix(View view){
        mAnswerView.setText(mAnswerView.getText()+"6");

    }
    public void onSeven(View view){
        mAnswerView.setText(mAnswerView.getText()+"7");

    }
    public void onEight(View view){
        mAnswerView.setText(mAnswerView.getText()+"8");

    }
    public  void  onNine(View view){
        mAnswerView.setText(mAnswerView.getText()+"9");
    }
    public void onZero(View view){
        mAnswerView.setText(mAnswerView.getText()+")");
    }
    public void onPersentage(View view){
        mAnswerView.setText(mAnswerView.getText()+"%");
    }
    public void onDot(View view){
        mAnswerView.setText(mAnswerView.getText()+".");
    }
    public void onEquals(View view){
//        now i am going to check if the edit text is null or not..
        if (mAnswerView.getText().toString().isEmpty()){
            Toast.makeText(this,"The data is empty",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Their is some data",Toast.LENGTH_LONG).show();
        }
    }
}