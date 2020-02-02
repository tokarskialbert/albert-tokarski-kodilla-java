package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOfNumbers implements ArrayOperations {

    public int[] generateAnArray(int length) {

        Random generator = new Random();
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++) {

            array[i] = generator.nextInt(100000);
        }
        return array;
    }

    @Override
    public double getAverage(int[] array) {

        IntStream.of(array)
                .forEach(System.out::println);

        OptionalDouble average = IntStream.of(array).average();

        if (average.isPresent()) {
            return average.getAsDouble();
        }
        else {

            return -1;
        }
    }
}


