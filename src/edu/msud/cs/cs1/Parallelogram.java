package edu.msud.cs.cs1;

public class Parallelogram extends Geometric{

    protected double a, b, theta;

    Parallelogram(double x, double y, double a, double b, double theta){
        super(x, y);
        this.a = a;
        this.b = b;
        this.theta= theta;
    }

    @Override
    public double getArea() {
        return Math.sin(theta) * a * b;
    }

    @Override
    public String toString() {
        return String.format("Parallelogram: x=%f y=%f a=%f b=%f theta=%f", x, y, a, b, theta);
    }
}
