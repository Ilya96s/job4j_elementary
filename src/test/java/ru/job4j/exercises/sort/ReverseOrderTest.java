package ru.job4j.exercises.sort;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ReverseOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}