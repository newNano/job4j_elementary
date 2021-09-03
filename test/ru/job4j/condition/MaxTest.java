package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7or8or3Then8() {
        int a = 7;
        int b = 8;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12or25or36Then36() {
        int a = 12;
        int b = 25;
        int c = 36;
        int result = Max.max(a, b, c);
        int expected = 36;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12or45or36or19Then45() {
        int a = 12;
        int b = 45;
        int c = 36;
        int d = 19;
        int result = Max.max(a, b, c, d);
        int expected = 45;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100or4or64or77Then100() {
        int a = 100;
        int b = 4;
        int c = 64;
        int d = 77;
        int result = Max.max(a, b, c, d);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}