package ru.job4j.oop.point;

import junit.framework.TestCase;

public class PointTest extends TestCase {

    public void testDistance3d() {
        Point a = new Point (0, 2, 4);
        Point b = new Point (3, 3, 6);
        double rsl = a.distance(b);
        System.out.println(rsl);

    }
}