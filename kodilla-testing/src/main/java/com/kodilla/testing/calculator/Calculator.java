package com.kodilla.testing.calculator;

import java.util.Arrays;

public class Calculator {

    private double sumResult;
    private double subtractResult;

    public void add(double... args) {

        double[] number = args;
        this.sumResult = Arrays.stream(number).sum();
    }

    public double getSumResult() {
        return sumResult;
    }

    public void subtract(double... args) {

        double[] number = args;
        this.subtractResult = number[0];
        for(int i = 0; i < number.length; i++) {

            if(number[i] != number[0]) {

                this.subtractResult -= number[i];
            }
        }
    }

    public double getSubtractResult() {
        return subtractResult;
    }
}
