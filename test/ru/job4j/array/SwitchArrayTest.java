package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to1() {
        int[] input = {5, 8, 1, 7, 9};
        int source = 3;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 7, 1, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to7() {
        int[] input = {5, 8, 1, 7, 9, 12, 18, 0, 4};
        int source = 2;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 8, 0, 7, 9, 12, 18, 1, 4};
        assertArrayEquals(expected, result);
    }
}