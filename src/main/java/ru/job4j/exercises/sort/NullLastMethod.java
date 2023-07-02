package ru.job4j.exercises.sort;

import java.util.Comparator;

/**
 * @author Ilya Kaltygin
 */
public class NullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
