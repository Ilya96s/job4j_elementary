package ru.job4j.exercises.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ilya Kaltygin
 */
public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
