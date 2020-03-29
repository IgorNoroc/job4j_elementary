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
}
