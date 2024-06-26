package com.dev.inheritance;

import com.dev.inheritance.model.Shape;
import com.dev.inheritance.model.Triangle;

public class InheritanceDemo {
    public static void main(String[] args) {
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
        Triangle[] triangles = new Triangle[10];
        shapes = triangles;
        shapes[0] = new Triangle(1,2,3,"red", true);
        System.out.println("When shapes = circles");
        System.out.println("shapes[0].side3 = " + triangles[0].getSide3());
    }
}
