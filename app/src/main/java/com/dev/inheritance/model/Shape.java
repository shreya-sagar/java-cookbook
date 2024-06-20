package com.dev.inheritance.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}
