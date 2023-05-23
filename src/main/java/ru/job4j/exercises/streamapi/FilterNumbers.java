package ru.job4j.exercises.streamapi;

import java.util.List;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
