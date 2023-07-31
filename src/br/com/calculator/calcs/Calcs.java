package br.com.calculator.calcs;

public class Calcs {
    private double num1;
    private double num2;
    public Calcs(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double sum(){
        return num1 + num2;
    }
    public double subtraction(){
        return num1 - num2;
    }
    public double division(){
        return num1 / num2;
    }
    public double multiplication(){
        return num1 * num2;
    }


    @Override
    public String toString() {
        return "The result is: ";
    }
}
