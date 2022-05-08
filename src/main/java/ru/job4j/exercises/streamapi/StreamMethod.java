package ru.job4j.exercises.streamapi;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Создание стрима из переданной коллекции
 *
 * Метода stream() в Map и его реализациях нет. Но есть методы keySet, entrySet(), values()
 * которые возвращают реализации Collection, поэтому после вызовов этих методов можно вызвать метод stream()
 */
public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
