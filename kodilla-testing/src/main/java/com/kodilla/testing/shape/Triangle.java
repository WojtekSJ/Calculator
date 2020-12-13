package com.kodilla.testing.shape;

public class Triangle implements Shape  {
double base;
double height;
double field;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.field = this.base * this.height;
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
        return "Triangle";
    }

    @Override
    public int hashCode() {
        return (int)field;
    }
}
