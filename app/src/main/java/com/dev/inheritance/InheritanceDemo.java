package com.dev.inheritance;

import com.dev.inheritance.model.Circle;
import com.dev.inheritance.model.Rectangle;
import com.dev.inheritance.model.Shape;
import com.dev.inheritance.model.Triangle;

public class InheritanceDemo {
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

        /**
         * arrays of subclass references can be converted to arrays of
         * superclass references
         */
        Shape[] shapes = new Shape[10];
        Circle[] circles = new Circle[10];
        shapes = circles;
        shapes[0] = new Circle(2,"red", true);
        System.out.println("When shapes = circles");
        System.out.println("shapes[0].radius = " + circles[0].getRadius());
    }
}
