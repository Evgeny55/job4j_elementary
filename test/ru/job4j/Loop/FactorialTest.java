package ru.job4j.Loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int rsl = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int rsl = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(rsl, expected);
    }
}