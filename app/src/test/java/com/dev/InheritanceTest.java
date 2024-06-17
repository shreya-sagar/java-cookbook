package com.dev;

import com.dev.inheritance.Circle;
import com.dev.inheritance.Rectangle;
import com.dev.inheritance.Shape;
import com.dev.inheritance.Triangle;

public class InheritanceTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "red", true);
        System.out.println(circle.toString());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(3.0, 4.0, 5.0, "green", true);
        System.out.println(triangle.toString());
        System.out.println("Color of triangle: " + triangle.getColor());
        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
    }
}
