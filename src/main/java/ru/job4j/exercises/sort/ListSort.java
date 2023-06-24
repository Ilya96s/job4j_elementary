package ru.job4j.exercises.sort;

import java.util.Comparator;
import java.util.List;

/**
 * @author Ilya Kaltygin
 */
public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
