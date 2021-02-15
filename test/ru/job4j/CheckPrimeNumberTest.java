package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.CheckPrimeNumber;
import ru.job4j.Loop.Fitness;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class PrimeNumberTest {
    private CheckPrimeNumber PrimeNumber;

    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}