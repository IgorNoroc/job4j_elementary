package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point point = new Point(0, 0);
        Point another = new Point(0, 2);
        double out = 2.0;
        double expected = point.distance(another);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(5, 0, 2);
        Point b = new Point(0, 2, 2);
        double out = 5.38;
        double expected = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
