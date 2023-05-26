package ru.job4j.exercises.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterStringTest {

    @Test
    public void test() {
        List<String> list = List.of("Abc.java", "abc.java", "Abc");
        assertEquals(List.of("Abc.java"), FilterString.filter(list));
    }

}