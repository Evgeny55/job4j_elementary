package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTestTest {

    public void whenConverter140RubleThen2Euro() {
        int valve1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(valve1);
        Assert.assertEquals(expected1, out1);
    }

    public void whenConverter180RubleThen3Euro() {

    }

}