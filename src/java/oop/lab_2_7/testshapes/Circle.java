package java.oop.lab_2_7.testshapes;

import static java.lang.Math.*;


public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + shapeColor +
                ", radius=" + radius +
                '}';
    }
}
