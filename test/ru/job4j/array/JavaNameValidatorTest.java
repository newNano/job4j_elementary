package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.job4j.array.JavaNameValidator.isNameValid;

public class JavaNameValidatorTest {
    @Test
    public void whenFullLatValid() {
        assertTrue(isNameValid("first"));
    }

    @Test
    public void whenLatNumberValid() {
        assertTrue(isNameValid("first1"));
    }

    @Test
    public void whenLatNumberUnderValid() {
        assertTrue(isNameValid("first_user"));
    }

    @Test
    public void whenNumberInValid() {
        assertFalse(isNameValid("123"));
    }

}