package ru.job4j.exercises.streamapi;

import java.util.List;
import java.util.Optional;

/**
 * @author Ilya Kaltygin
 */
public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(s -> s.endsWith(".java"))
                .findFirst()
                .flatMap(s -> Optional.of(s.length()));
    }
}
