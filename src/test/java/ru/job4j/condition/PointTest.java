package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when210To27Then3() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 2;
        int y2 = 7;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when545To238Then41point14() {
        int x1 = 5;
        int y1 = 45;
        int x2 = 23;
        int y2 = 8;
        double expected = 41.14;
        double out = Point.distance1(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when29To211Then2() {
        int x1 = 2;
        int y1 = 9;
        int x2 = 2;
        int y2 = 11;
        double expected = 2;
        double out = Point.distance2(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

/* result (0, 0) to (2, 0) 3.0
result (0, 0) to (2, 0) 41.14608122288197
result (0, 0) to (2, 0) 2.0 */