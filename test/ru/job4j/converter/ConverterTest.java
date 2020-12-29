package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConverter140RubleThen2Euro() {
        int valve1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(valve1);
        Assert.assertEquals(expected1, out1);
    }

    public static int rubleToEuro(int valve1) {
        return valve1;
    }

    @Test
    public void whenConverter140RubleTThen2Euro() {
    }
}