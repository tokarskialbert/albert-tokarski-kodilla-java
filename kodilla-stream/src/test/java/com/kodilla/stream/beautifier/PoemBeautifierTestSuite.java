package com.kodilla.stream.beautifier;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoemBeautifierTestSuite {

    @Test
    public void testTextToLowerCase() {

        //given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String myText = "fire";

        //when
        String result = poemBeautifier.beautify("FIRE", text -> text.toLowerCase());
        //then
        Assert.assertTrue(myText.equals(result));
    }

    @Test
    public void testAddAnotherCharsToString() {

        //given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String myText = "FIREWALL";

        //when
        String result = poemBeautifier.beautify("FIRE", text -> text.concat("WALL"));
        //then
        Assert.assertTrue(myText.equals(result));
    }

    @Test
    public void testReplaceChar() {

        //given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String myText = "FIREWA11";

        //when
        String result = poemBeautifier.beautify("FIREWALL", text -> text.replace('L','1'));
        //then
        Assert.assertTrue(myText.equals(result));
    }
}
