package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K5Square2point22() {
        double expected = 2.22;
        int p = 8;
        double k = 5;
        double out = SqArea.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K3Square18point75() {
        double expected = 18.75;
        int p = 20;
        double k = 3;
        double out = SqArea.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP65K8Square104point32() {
        double expected = 104.32;
        int p = 65;
        double k = 8;
        double out = SqArea.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}