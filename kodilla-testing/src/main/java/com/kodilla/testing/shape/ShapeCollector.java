package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    //double result;
    private List<Shape> collector = new ArrayList<>();


    public void addFigure(Shape shape) {
        collector.add(shape);
    }

    public int getShapeNumber() {
        return collector.size();
    }

    public boolean remove(Shape shape) {
        int size = collector.size();
        int afterSize;
        collector.remove(shape);
        afterSize = collector.size();
        if (afterSize == (size - 1)) {
            return true;
        }
        else {
            return false;
        }

    }

    public Shape getFigure(int i) {
        if (i < 0 || i > (collector.size() - 1)) {
            return null;
        }
        else{
            return collector.get(i);
        }
    }

    public String showFigures() {
        String arrayContent = "";
        int arraySize = collector.size();
        for (int i =0; i < collector.size(); i++) {
            if (i == 0) {
                arrayContent = collector.get(i).getShapeName();
            }
            else {
                arrayContent = arrayContent + ", " + collector.get(i).getShapeName();
            }
        }

        return arrayContent;
    }



}
