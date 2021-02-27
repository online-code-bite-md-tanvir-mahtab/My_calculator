package com.tanvircodder.mycalculatorapp;

public class CalculationFunction {
    private float result;
    /*now I am going to add the mathod that will
    * do all the calculation
    * like substraction , multiplication,
    * division, parsentage*/
    public float subsTraction(float value1,float value2){
        result = value1 - value2;
        return result;
    }
    public float multiplication(float value1,float value2){
        result = value1 * value2;
        return result;
    }
    public float addition(float value1,float value2){
        result = value1 + value2;
        return result;
    }
    public float division(float value1,float value2){
        result = value1 / value2;
        return result;
    }
    public float persentage(float value1){
        result = value1/100;
        return result;
    }
}
