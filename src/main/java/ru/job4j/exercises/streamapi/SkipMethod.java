package ru.job4j.exercises.streamapi;

import java.util.List;

/**
 * Чтобы опустить какое-то число элементов стрима, можно использовать метод skip()
 *
 * Например,
 *
 * List.of(1, 2, 3, 4, 5).stream().skip(2) // будет стрим из элементов 3, 4, 5
 *
 * Ваша задача взять и получить элементы списка, за исключением первых двух
 *
 * @author Ilya Kaltygin
 */
public class SkipMethod {
    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .toList();
    }
}
