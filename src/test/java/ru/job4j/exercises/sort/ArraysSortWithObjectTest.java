package ru.job4j.exercises.sort;

import org.junit.Assert;
import org.junit.Test;

public class ArraysSortWithObjectTest {

    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expect = {"c", "b", "a"};
        Assert.assertArrayEquals(expect, result);
    }

}