package ru.job4j.exercises.streamapi;

import java.util.List;

/**
 * Для того, чтобы получить отсортированный стрим, можно использовать метод sorted().
 * Стоит учесть, что реализация этого метода без входных параметров использует реализованный метод compareTo()
 * интерфейса Comparable. Поэтому если вы  сортируете объекты, определенного класса, нужно либо передавать Comparator,
 * либо реализовывать Comparable
 *
 * @author Ilya Kaltygin
 */
public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted()
                .toList();
    }
}
