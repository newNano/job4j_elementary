package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then3() {
        int[] data = {3, 8, 2, 5, 7, 10, 21};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4ThenMinus1() {
        int[] data = {3, 8, 2, 5, 7};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }
}