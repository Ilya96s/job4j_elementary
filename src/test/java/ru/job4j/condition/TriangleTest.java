package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void when1and3and4ThenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ca = 2.0;
        boolean rsl = Triangle.exist(ab, bc, ca);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when3and5and2ThenNotExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ca = 10.0;
        boolean rsl = Triangle.exist(ab, bc, ca);
        Assert.assertFalse(rsl);
    }
}