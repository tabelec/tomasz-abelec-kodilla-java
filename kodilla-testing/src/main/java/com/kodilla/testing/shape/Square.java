package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;
    private int field;

    public Square(int side) {
        this.side = side;
        getField();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        String shapeName = "Square";
        return shapeName;
    }

    @Override
    public int getField() {
        field = side * side;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (side != square.side) return false;
        return field == square.field;
    }

    @Override
    public int hashCode() {
        int result = side;
        result = 31 * result + field;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", field=" + field +
                '}';
    }
}
