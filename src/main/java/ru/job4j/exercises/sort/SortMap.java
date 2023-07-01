package ru.job4j.exercises.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ilya Kaltygin
 */
public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        return result;
    }
}
