package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {


    @Before
    public void before () {
        System.out.println("test case - start");
    }

    @After
    public void after() {
        System.out.println("test case - end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyArrayList = new ArrayList<Integer>();

        //when
        List<Integer> result = new ArrayList<Integer>(oddNumbersExterminator.exterminate((ArrayList<Integer>) emptyArrayList));

        //then
        Assert.assertEquals(emptyArrayList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        List<Integer> numbersList = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            numbersList.add(i);
        }

        List<Integer> numbersList2 = new ArrayList<Integer>();

            numbersList2.add(2);
            numbersList2.add(4);
            numbersList2.add(6);
            numbersList2.add(8);

        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        List<Integer> result = new ArrayList<Integer>(oddNumbersExterminator.exterminate((ArrayList<Integer>) numbersList));

        //then
        Assert.assertEquals(numbersList2, result);
    }
}
