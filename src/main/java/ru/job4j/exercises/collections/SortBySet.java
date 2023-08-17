package ru.job4j.exercises.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * задача получить отсортированный сет по списку строк. Среди элементов нет null.
 *
 * @author Ilya Kaltygin
 */
public class SortBySet {
    public static Set<String> sort(List<String> list) {
        return new TreeSet<>(list);
    }
}
