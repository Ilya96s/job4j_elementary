package ru.job4j.exercises.streamapi;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы данных итераторов в List.
 *
 * Для преобразование итератора в стрим нужно воспользоваться методом iteratorToStream(). Для решения нужно также использовать методы flatMap() и collect().
 *
 * @author Ilya Kaltygin
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return iteratorToStream(it).flatMap(FlatIt::iteratorToStream).collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false);
    }
}
