package edu.msud.cs.cs1;

public class Rectangle extends Parallelogram {

    Rectangle(double x, double y, double a, double b) {
        super(x, y, a, b, Math.PI/2);
    }


    @Override
    public String toString() {
        return String.format("Rectangle: x=%f y=%f a=%f b=%f", x, y, a, b);
    }
}
