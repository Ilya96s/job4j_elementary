package ru.job4j.exercises.streamapi;

/**
 * Как вы наверное уже догадались поиск минимального элемента представляет собой также редукцию. Этот метод принимает Comparator и возвращает Optional. Если список пуст вернется пустой Optional.
 *
 * Пример,
 *
 * Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
 *
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 *
 * @author Ilya Kaltygin
 */

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream()
                .min((str1, str2) -> str1.compareTo(str2)).get();
    }
}
