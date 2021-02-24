package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when00to30then3() {
        int expected = 3;
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when00to68then10() {
        int expected = 10;
        Point a = new Point(0, 0);
        Point b = new Point(6, 8);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void whenPoint3D() {
        double expected = 5.385164807134504;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 5);
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }
}