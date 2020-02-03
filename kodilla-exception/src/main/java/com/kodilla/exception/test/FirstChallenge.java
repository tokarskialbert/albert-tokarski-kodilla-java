package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

        try{
            return a / b;

        } catch (ArithmeticException ex) {

            System.out.println("Error: " + ex.getStackTrace());
            return -1.0;
        }
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}