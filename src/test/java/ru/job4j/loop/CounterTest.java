package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumByEvenNumbersFromOneToTenThenThrity() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenNumbersFromTwoToSixteenThenSeventyTwo() {
        int start = 2;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 72;
        Assert.assertEquals(expected, result);
    }
}