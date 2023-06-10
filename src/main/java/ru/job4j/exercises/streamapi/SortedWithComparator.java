package ru.job4j.exercises.streamapi;

import java.util.Comparator;
import java.util.List;

/**
 * @author Ilya Kaltygin
 */
public class SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
