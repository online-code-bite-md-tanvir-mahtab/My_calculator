package com.tanvircodder.mycalculatorapp;

public class CalculationFunction {
    private double result;
    /*now I am going to add the mathod that will
    * do all the calculation
    * like substraction , multiplication,
    * division, parsentage*/
    public double subsTraction(double value1,double value2){
        result = value1 - value2;
        return result;
    }
    public double multiplication(double value1,double value2){
        result = value1 * value2;
        return result;
    }
    public double addition(double value1,double value2){
        result = value1 + value2;
        return result;
    }
    public double division(double value1,double value2){
        result = value1 / value2;
        return result;
    }
    public double persentage(double value1,double value2){
        result = (value1/100)*value2;
        return result;
    }
}
