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

        for (int i = 0; i < 10; i++) {
            numbersList.add(i);
        }

        List<Integer> numbersList2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                numbersList2.add(i);
            }
        }

        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        List<Integer> result = new ArrayList<Integer>(oddNumbersExterminator.exterminate((ArrayList<Integer>) numbersList));

        //then
        Assert.assertEquals(numbersList2, result);
    }
}
