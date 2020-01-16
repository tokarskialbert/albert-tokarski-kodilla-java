package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.add(4.4, 2.4, 4.3);
        myCalculator.subtract(10,2,1);

        double sumResult = myCalculator.getSumResult();
        if(sumResult == 11.1) {
            System.out.println("The add method test is ok");
        } else {
            System.out.println("Error");
        }

        double subtractResult = myCalculator.getSubtractResult();
        if(subtractResult == 7) {
            System.out.println("The subtract method test is ok");
        } else {
            System.out.println("Error");
        }
    }
}
