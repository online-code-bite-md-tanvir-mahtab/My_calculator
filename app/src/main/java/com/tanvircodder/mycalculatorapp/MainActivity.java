package com.tanvircodder.mycalculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    creating the constant..//
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
//    to hold the character data we are going to create another variable for the char..//
    private char CURRENT_CHOOSEN_SYMBOL ;
    EditText mAnswerView;
    TextView mTextView;
    private double number;
//    user press the calculation button../
    private int pressTime= 0;
//    to store the value of the oparator call we are going to declare the float variable..//
    double firstValue = Double.NaN;
    double secondValue;
//    for checking which value the user input with the help of boolean variable..///
    boolean addition;
    boolean substraction;
    boolean multiplication;
    boolean divition;
    boolean persentage;
// creting the instance of the claculation class..//
    private CalculationFunction mCalculation;
    private DecimalFormat mDecimalFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nwo i am inisializing the view..//
        mAnswerView = (EditText) findViewById(R.id.answer_of_the_calculation);
        mTextView = (TextView) findViewById(R.id.answer_text_view);
        mCalculation = new CalculationFunction();
        mDecimalFormat = new DecimalFormat("#####.######");
    }
    public void onOne(View view){
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
//        now i am going to get the text form the editext..//
        String value = mAnswerView.getText().toString();
        firstValue = Double.parseDouble(value);
        mTextView.setText(mDecimalFormat.format(firstValue) + "+");

        addition = true;
//        mulipleTimeCalculation(ADDITION,2);
        mAnswerView.setText(null);
        mAnswerView.setVisibility(View.VISIBLE);

    }
    public void onMinus(View view){
        String value = mAnswerView.getText().toString();
        firstValue = Double.parseDouble(value);

        mTextView.setText(mDecimalFormat.format(firstValue) + "-");
        substraction = true;
        mAnswerView.setText(null);
        mAnswerView.setVisibility(View.VISIBLE);

    }
    public void onMulti(View view){
        String value = mAnswerView.getText().toString();
        firstValue = Double.parseDouble(value);

        mTextView.setText(mDecimalFormat.format(firstValue) + "*");
        multiplication = true;
        mAnswerView.setText(null);
        mAnswerView.setVisibility(View.VISIBLE);
    }
    public void onDivi(View view){
        String value = mAnswerView.getText().toString();
        firstValue = Double.parseDouble(value);

        mTextView.setText(mDecimalFormat.format(firstValue) + "/");
        divition = true;
        mAnswerView.setText(null);
        mAnswerView.setVisibility(View.VISIBLE);
    }
    public void onPersentage(View view){
        String valueTopersentage = mAnswerView.getText().toString();
        firstValue = Double.parseDouble(valueTopersentage);
        mTextView.setText(mDecimalFormat.format(firstValue) + "%");
        persentage = true;
        mAnswerView.setText(null);
        mAnswerView.setVisibility(View.VISIBLE);

    }
    public void onEquals(View view){
        String seVal = mAnswerView.getText().toString();
        secondValue = Double.parseDouble(seVal);
        if (addition == true){

            number = mCalculation.addition(firstValue,secondValue);
            mTextView.setText(mDecimalFormat.format(firstValue) + "+" + mDecimalFormat.format(secondValue) + "=" + mDecimalFormat.format(number));
            mAnswerView.setText(mDecimalFormat.format(number));
//            now i don't went to show the naswer after clicking the equal sign..//
//            so i invisible the view...//
            mAnswerView.setVisibility(View.INVISIBLE);
            addition = false;
        }
        if (substraction == true){
            number = mCalculation.subsTraction(firstValue,secondValue);
            mTextView.setText(mDecimalFormat.format(firstValue) + "-" + mDecimalFormat.format(secondValue) + "=" + mDecimalFormat.format(number));
            mAnswerView.setText(mDecimalFormat.format(number));
            mAnswerView.setVisibility(View.INVISIBLE);
            substraction = false;
        }
        if (multiplication == true){
            number = mCalculation.multiplication(firstValue,secondValue);
            mTextView.setText(mDecimalFormat.format(firstValue) + "*" + mDecimalFormat.format(secondValue) + "=" + mDecimalFormat.format(number));
            mAnswerView.setText(mDecimalFormat.format(number));
            mAnswerView.setVisibility(View.INVISIBLE);
            multiplication = false;
        }
        if (divition == true){
            number = mCalculation.division(firstValue,secondValue);
            mTextView.setText(mDecimalFormat.format(firstValue) + "/" + mDecimalFormat.format(secondValue) + "=" + mDecimalFormat.format(number));
            mAnswerView.setText(mDecimalFormat.format(number));
            mAnswerView.setVisibility(View.INVISIBLE);
            divition = false;
        }
        if (persentage == true){
            number = mCalculation.persentage(firstValue,secondValue);
            mTextView.setText(mDecimalFormat.format(firstValue) + "%" + mDecimalFormat.format(secondValue) + "=" + mDecimalFormat.format(number));
            mAnswerView.setText(mDecimalFormat.format(number));
            mAnswerView.setVisibility(View.INVISIBLE);
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
            mAnswerView.setVisibility(View.VISIBLE);
            if (firstValue != 0 && secondValue != 0){
                mAnswerView.setText(null);
                mAnswerView.setHint("0");
                mTextView.setText(null);
                mTextView.setText("0");
            }else {
                mAnswerView.setHint("0");
                mTextView.setText("0");
                mAnswerView.setHint(null);
                mTextView.setText(null);
            }
        }
        if (id == R.id.delete){
//            i have get the vlue form the editext and store them inside an string variable....//
            String value = mAnswerView.getText().toString();
            /*then i have split the value and store them inside the string array variable
            * because when we use the split builin library it split the text in array */
            String[] singleNumber = value.split("");
            /*nwo i am going to create an list variabe that will hold the array string
            * value inside of it the variable name is listValue*/
            List<String> listValue = new ArrayList<>();
            for (int i =0;i<singleNumber.length;i++){
                listValue.add(singleNumber[i]);
            }
//            now i am going to delet the last index of the list..//
            listValue.remove(singleNumber.length - 1);
//            now i need to make the string list in to the string value..//
            /*now i am going to create the StringBuilder object..*/
            StringBuilder sb = new StringBuilder();
            for (String s:listValue){
                sb.append(s);
            }
//            now I am going to set the sb to the editText view..//
            mAnswerView.setText(sb.toString());
        }
        // : 3/1/2021 i need to add another menu heir..
        return super.onOptionsItemSelected(item);
    }
    public void mulipleTimeCalculation(char CURRENT_CHOOSEN_SYMBOL, int pressTime){
        // TODO: 2/28/2021 I need to add some logic in heir to do the multiple value calculation
        String seVal = mAnswerView.getText().toString();
        secondValue = Double.parseDouble(seVal);
         mAnswerView.setText(null);
            switch (CURRENT_CHOOSEN_SYMBOL){
                case ADDITION:
                    firstValue = this.firstValue + secondValue;
                    break;
                case SUBTRACTION:
                    firstValue = this.firstValue - secondValue;
                    break;
                case MULTIPLICATION:
                    firstValue = this.firstValue * secondValue;
                    break;
                case DIVISION:
                    firstValue = this.firstValue / secondValue;
                    break;
            }
    }
}