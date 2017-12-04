package edu.msud.cs.cs1;

public class Square extends Rectangle {

    Square(double x, double y, double a){
        super(x, y, a, a);
    }

    @Override
    public String toString() {
        return String.format("Square: x=%f y=%f a=%f", x, y, a);
    }
}
