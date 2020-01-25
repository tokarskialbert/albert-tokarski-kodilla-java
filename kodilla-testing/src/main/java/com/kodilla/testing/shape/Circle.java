package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private final String shapeName;
    private final double shapeField;

    public Circle(String shapeName, double shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.shapeField, shapeField) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(shapeName, shapeField);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return shapeField;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", shapeField=" + shapeField +
                '}';
    }
}
