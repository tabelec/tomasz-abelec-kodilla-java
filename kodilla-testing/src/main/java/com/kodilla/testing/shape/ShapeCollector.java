package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeCollectorList = new ArrayList<>();
    public void addFigure(Shape shape) {
        shapeCollectorList.add(shape);
    }
    public int getSize() {
        return shapeCollectorList.size();
    }

    public void removeFigure(Shape shape) {
        shapeCollectorList.remove(shape);
    }

    public Shape getFigure(int n) {
            if(n<0 || shapeCollectorList.size() < n) {
                return null;
            }
        return shapeCollectorList.get(n);
    }

    public void showFigures() {

    }
}