package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class SimpleStringEncoderTest {

    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }

    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertEquals(result, expected);
    }
}