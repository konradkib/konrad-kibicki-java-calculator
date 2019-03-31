package com.calculator.kodillacalculator;

public class Calculator {

    public int a;
    public int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void addAtoB(){
        System.out.println("Result a + b: "+ (a+b));
    }

    public void subtractBFromA(){
        System.out.println("Result a - b: "+(a-b));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,7);

        calculator.addAtoB();
        calculator.subtractBFromA();
    }

}
