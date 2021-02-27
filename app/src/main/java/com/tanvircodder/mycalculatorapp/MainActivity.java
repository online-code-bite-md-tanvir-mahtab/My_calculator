package com.tanvircodder.mycalculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    EditText mAnswerView;
    private float number;
//    to store the value of the oparator call we are going to declare the float variable..//
    float firstValue;
    float secondValue;
//    for checking which value the user input with the help of boolean variable..///
    boolean addition;
    boolean substraction;
    boolean multiplication;
    boolean divition;
    boolean persentage;
// creting the instance of the claculation class..//
    private CalculationFunction mCalculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nwo i am inisializing the view..//
        mAnswerView = (EditText) findViewById(R.id.answer_of_the_calculation);
        mCalculation = new CalculationFunction();
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
        mAnswerView.setText(mAnswerView.getText()+"0");
    }

    public void onDot(View view){
        mAnswerView.setText(mAnswerView.getText()+".");
    }
    public void onPlus(View view){
        if (mAnswerView == null){
            mAnswerView.setText("");
        }else {
            firstValue = Float.parseFloat(mAnswerView.getText()+"");
            addition = true;
            mAnswerView.setText(null);
        }
    }
    public void onMinus(View view){
        if (mAnswerView == null){
            mAnswerView.setText(" ");
        }else {
            firstValue = Float.parseFloat(mAnswerView.getText() + "");
            substraction = true;
            mAnswerView.setText(null);
        }

    }
    public void onMulti(View view){
        if (mAnswerView == null){
            mAnswerView.setText(" ");
        }else {
            firstValue= Float.parseFloat(mAnswerView.getText() + "");
            multiplication = true;
            mAnswerView.setText(null);
        }
    }
    public void onDivi(View view){
        if (mAnswerView == null){
            mAnswerView.setText(" ");
        }else {
            firstValue = Float.parseFloat(mAnswerView.getText() + " ");
            divition = true;
            mAnswerView.setText(null);
        }
    }
    public void onPersentage(View view){
        if (mAnswerView == null){
            mAnswerView.setText(" ");
        }else {
            firstValue = Float.parseFloat(mAnswerView.getText() + " ");
            persentage = true;
            mAnswerView.setText(null);
        }
    }
    public void onEquals(View view){
        secondValue = Float.parseFloat(mAnswerView.getText() + "");
        if (addition == true){
            number = mCalculation.addition(firstValue,secondValue);
            mAnswerView.setText(number+" ");
            addition = false;
        }
        if (substraction == true){
            number = mCalculation.subsTraction(firstValue,secondValue);
            mAnswerView.setText(number + "");
            substraction = false;
        }
        if (multiplication == true){
            number = mCalculation.multiplication(firstValue,secondValue);
            mAnswerView.setText(number + "");
            multiplication = false;
        }
        if (divition == true){
            number = mCalculation.division(firstValue, secondValue);
            mAnswerView.setText(number + "");
            divition = false;
        }
        // TODO: 2/25/2021 I also need to add some other button heir
//        now i am going to access the menu bar of trhe menu file
        if (persentage == true){
            number = mCalculation.persentage(firstValue);
            mAnswerView.setText(number + "");
            persentage = false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        now i am goning to get the menu layout..//
        getMenuInflater().inflate(R.menu.cancle_out,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cancel_button){
            if (firstValue != 0 && secondValue != 0){
                mAnswerView.setText(null);
                mAnswerView.setHint("0");
            }else {
                mAnswerView.setHint("0");
            }
        }
        return super.onOptionsItemSelected(item);
    }
}