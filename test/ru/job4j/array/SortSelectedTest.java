package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 9, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 7, 9};
        assertArrayEquals(expected, result);
    }

}