package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //given
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers();

        //when
        int[] someNumbers = new int[]{3, 6, 3};
        double result = arrayOfNumbers.getAverage(someNumbers);

        //then
        Assert.assertTrue(4.0 == result);
    }
}
