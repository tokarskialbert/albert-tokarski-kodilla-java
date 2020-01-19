package com.kodilla.testing.shape;

import com.kodilla.testing.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> geometricFiguresList = new ArrayList<Shape>();

    public void addFigureToTheList(Shape shape) {

        this.geometricFiguresList.add(shape);
    }

    public void removeFigureFromTheList(Shape shape) {

        this.geometricFiguresList.remove(shape);
        System.out.println(shape.getShapeName() + " removed from the list");
    }

    public Shape getFigureFromTheListUsingIndex(int index) {

        return this.geometricFiguresList.get(index);
    }

    public List<Shape> getGeometricFiguresList() {
        return geometricFiguresList;
    }
}


