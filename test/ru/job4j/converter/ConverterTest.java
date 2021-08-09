package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert10DollarThen600Rub() {
        float inDollar = 10;
        float expected = 600;
        float out = Converter.dollarToRub(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1DollarThen0point857Euro() {
        float inDollar = 1;
        float expected = 0.8571f;
        float out = Converter.dollarToEuro(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert6EuroThen420Rub() {
        float inEuro = 6;
        float expected = 420;
        float out = Converter.euroToRub(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert1EuroThen1point1667Dollar() {
        float inEuro = 1;
        float expected = 1.1667f;
        float out = Converter.euroToDollar(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}