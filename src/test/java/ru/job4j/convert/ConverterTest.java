package ru.job4j.convert;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert240Rbl2Euro() {
        float in = 240;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        float eps = 0.000f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert210Rbl2Dollar() {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.000f;
        Assert.assertEquals(expected, out, eps);
    }
}