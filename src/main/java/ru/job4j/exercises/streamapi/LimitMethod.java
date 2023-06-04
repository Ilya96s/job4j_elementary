package ru.job4j.exercises.streamapi;

import java.util.List;

/**
 * Чтобы взять какое-то число первых элементов стрима, можно использовать метод limit()
 *
 * Например,
 *
 * List.of(1, 2, 3, 4, 5).stream().limit(2) // будет стрим из элементов 1, 2
 *
 * Ваша задача взять первые 3 элемента из списка
 *
 * @author Ilya Kaltygin
 */
public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .toList();
    }
}
