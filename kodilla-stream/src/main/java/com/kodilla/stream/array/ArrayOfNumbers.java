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

        return IntStream.of(array)
                .average()
                .orElse(-1.0);
    }
}


