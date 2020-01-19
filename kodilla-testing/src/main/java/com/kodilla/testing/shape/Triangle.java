package com.kodilla.testing.shape;

import com.kodilla.testing.Shape;

import java.util.Objects;

public class Triangle implements Shape {

    private final String shapeName;
    private final double shapeField;

    public Triangle(String shapeName, double shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getField() {
        return this.shapeField;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", shapeField=" + shapeField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.shapeField, shapeField) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, shapeField);
    }
}
