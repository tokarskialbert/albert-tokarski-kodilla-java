package com.kodilla.testing.shape;

import com.kodilla.testing.Shape;

import java.util.Objects;

public class Square implements Shape {

    private final String shapeName;
    private final double shapeField;

    public Square(String shapeName, double shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return shapeField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.shapeField, shapeField) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, shapeField);
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", shapeField=" + shapeField +
                '}';
    }
}
