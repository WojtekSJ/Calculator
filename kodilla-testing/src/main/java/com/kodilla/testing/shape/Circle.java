package com.kodilla.testing.shape;

public class Circle implements Shape{
    double pi = 3.14;
    double radius;
    double field;
    public Circle(double radius) {

        this.radius = radius;
        this.field = this.radius * this.pi;
    }
    @Override
    public String getShapeName() {
        return toString();
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public int hashCode() {
        return (int)field;
    }

}
