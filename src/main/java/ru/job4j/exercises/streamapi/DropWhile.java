package ru.job4j.exercises.streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ilya Kaltygin
 */
public class DropWhile {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(n -> n < 0)
                .collect(Collectors.toList());
    }
}
