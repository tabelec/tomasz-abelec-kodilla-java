package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int base;
    private int height;
    private int field;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
        getField();
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getShapeName() {
        String shapeName = "Triangle";
        return shapeName;
    }

    @Override
    public int getField() {
        field = (int) (0.5 * this.base * this.height);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (base != triangle.base) return false;
        if (height != triangle.height) return false;
        return field == triangle.field;
    }

    @Override
    public int hashCode() {
        int result = base;
        result = 31 * result + height;
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", field=" + field +
                '}';
    }
}
