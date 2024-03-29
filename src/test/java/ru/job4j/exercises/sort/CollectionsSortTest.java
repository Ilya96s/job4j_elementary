package ru.job4j.exercises.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionsSortTest {

    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expect = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        Assert.assertEquals(expect, out);
    }

}