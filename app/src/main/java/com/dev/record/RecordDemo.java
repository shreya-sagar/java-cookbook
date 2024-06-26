package com.dev.record;

import com.dev.record.model.Point;
import com.dev.record.model.Range;

public class RecordDemo {
    public static void main(String[] args) {
        Point p = new Point(5,5);
        System.out.println(p.toString());
        Point q = new Point(10,15);
        System.out.println(q.toString());
        double distanceBtwPQ = Point.distance(p,q);
        System.out.println("distanceBetweenPQ : "+ distanceBtwPQ);
        double distanceFromOrigin = Point.distance(Point.ORIGIN,q);
        System.out.println("distanceFromOrigin : "+ distanceFromOrigin);

        var range = new Range(10, 4);
        System.out.println("range : " + range);
    }
}
