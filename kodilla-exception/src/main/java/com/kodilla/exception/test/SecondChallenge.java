package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {

        try {
        boolean result = x >= 2 || x < 1 || y == 1.5;

        } catch (Exception ex) {

            throw new ExceptionHandling();
        } finally {

            System.out.println("its.. ok :)");
        }

        return "Done!";
    }
}
