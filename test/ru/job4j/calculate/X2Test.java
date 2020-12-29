package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then10() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 10;
        int y = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, y);

    }
}