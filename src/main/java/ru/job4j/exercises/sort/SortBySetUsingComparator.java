package ru.job4j.exercises.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }
}
