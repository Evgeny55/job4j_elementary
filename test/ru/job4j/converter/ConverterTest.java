package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public static void whenConverter140RubleThen2Euro(int valve1) {
        int valve1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(valve1);
        Assert.assertEquals(expected1, out1);

    }

    public static int whenConverter120RubleThen2Dollars(int valve2) {
        int valve2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollars(valve2);
        Assert.assertEquals(expected2, out2);
    }


    @Test
    public void whenConverter140RubleThen2Euro() {
    }

    public void whenConverter120RubleThen2Dollars() {

    }
}