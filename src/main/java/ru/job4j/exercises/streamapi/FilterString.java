package ru.job4j.exercises.streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Если условие громоздкое, то можно расположить несколько вызовов filter подряд. Ваша задача отфильтровать список строк по следующему признаку. Строка должна начинаться на "A" и заканчиваться на ".java"
 *
 * @author Ilya Kaltygin
 */
public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(str -> str.startsWith("A"))
                .filter(str -> str.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
