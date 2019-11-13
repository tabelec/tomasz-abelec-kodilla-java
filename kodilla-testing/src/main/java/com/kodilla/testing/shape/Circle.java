package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int radius;
    private int field;

    public Circle(int radius) {
        this.radius = radius;
        getField();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        String shapeName = "Circle";
        return shapeName;
    }

    @Override
    public int getField() {
        field = radius*radius;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return Double.compare(circle.field, field) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", field=" + field + "\u03C0" +
                '}';
    }
}
