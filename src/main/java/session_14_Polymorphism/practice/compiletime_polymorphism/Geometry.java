package session_14_Polymorphism.practice.compiletime_polymorphism;

public class Geometry {

    //calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    //calculate area of triangle
    public double area(double base, double hight) {
        return 0.5 * base * hight;
    }
}
