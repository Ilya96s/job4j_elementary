package ru.job4j.exercises.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SkipMethodTest {

    @Test
    public void test() {
        assertEquals(
                List.of("C", "D", "E"),
                SkipMethod.lastThree(List.of("A", "B", "C", "D", "E"))
        );
    }

}