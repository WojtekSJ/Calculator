package com.kodilla.testing.shape;

public class Square implements Shape{
    double side;
    double field;
    public Square(double side) {

        this.side = side;
        this.field = this.side * this.side;
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
    return "Square";
    }

    @Override
    public int hashCode() {
        return (int)field;
    }
}
