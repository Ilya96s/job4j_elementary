package ru.job4j.exercises.sort;

import java.util.Collections;
import java.util.List;

/**
 * @author Ilya Kaltygin
 */
public class CollectionsSort {
    public static List<String> sort(List<String> data) {
        Collections.sort(data);
        return data;
    }
}
