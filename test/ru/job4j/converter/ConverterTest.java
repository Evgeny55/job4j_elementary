package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConverter140RubleThen2Euro() {
        int valve = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(valve);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConverter120RubleThen2Dollars() {
        int valve = 120;
        int expected = 2;
        int out = Converter.rubleToDollars(valve);
        Assert.assertEquals(expected, out);
    }
}