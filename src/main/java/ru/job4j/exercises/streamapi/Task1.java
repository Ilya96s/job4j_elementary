package ru.job4j.exercises.streamapi;

import java.util.List;

public class Task1 {

    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 4 != 0)
                .toList();
    }
}
