package com.dev.record.model;

public record Point(double x, double y) {
    public static Point ORIGIN = new Point();

    public Point() {
        this(0,0);
    }

    public double distanceFromOrigin() {
        return Math.hypot(x,y);
    }

    public static double distance(Point p, Point q) {
        return Math.hypot(p.x - q.x, p.y - q.y);
    }
}
