package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.calculateDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to87then7point07() {
        double expected = 7.07;
        int x1 = 3;
        int y1 = 2;
        int x2 = 8;
        int y2 = 7;
        double out = Point.calculateDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when19to47then3point61() {
        double expected = 3.61;
        int x1 = 1;
        int y1 = 9;
        int x2 = 4;
        int y2 = 7;
        double out = Point.calculateDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to82then6point71() {
        double expected = 6.71;
        int x1 = 2;
        int y1 = 5;
        int x2 = 8;
        int y2 = 2;
        double out = Point.calculateDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when78to11then9point22() {
        double expected = 9.22;
        int x1 = 7;
        int y1 = 8;
        int x2 = 1;
        int y2 = 1;
        double out = Point.calculateDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}