package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try{

            return a / b;

        } catch (Exception ex) {

            throw new ArithmeticException();

        }
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);

        } catch (ArithmeticException ex) {

            System.out.println("Error! " + ex.getStackTrace());
        }
    }
}