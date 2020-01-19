package com.kodilla.testing.shape;

import com.kodilla.testing.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ShapeCollectorTestSuite {
    private static int counter = 0;

    @Before
    public void before() {
        counter++;
        System.out.println("Im starting test " + counter);
    }
    @Test
    public void testAddFigureToTheList() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 25);

        //when
        shapeCollector.addFigureToTheList(triangle);
        List<Shape> result = shapeCollector.getGeometricFiguresList();

        //then
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void testRemoveFigureFromTheList() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 25);

        //when
        shapeCollector.getGeometricFiguresList().add(triangle);
        List<Shape> result = shapeCollector.getGeometricFiguresList();
        shapeCollector.removeFigureFromTheList(triangle);


        //then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testGetFigureFromTheListUsingIndex() {

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 25);

        shapeCollector.addFigureToTheList(triangle);

        Shape result = shapeCollector.getFigureFromTheListUsingIndex(0);

        //then
        Assert.assertTrue(result.equals(triangle));
    }
}
