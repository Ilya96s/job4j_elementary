package ru.job4j.exercises.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DropWhileTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DropWhile.dropWhile(List.of(3, 2, 1, -1, -2))
        );
    }

}