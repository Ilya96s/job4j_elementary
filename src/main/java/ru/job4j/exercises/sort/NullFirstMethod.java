package ru.job4j.exercises.sort;

import java.util.Comparator;

/**
 * Если среди элементов есть null, то методы naturalOrder(), reverseOrder() выкинут NullPointerException. Для избежания этой ситуации используется null-friendly компаратор, который проверяет сначала элементы на null. Если мы хотим, чтобы наши null элементы скопились в начале, то мы можем использовать метод nullsFirst(). В отличие от методов naturalOrder(), reverseOrder(), этот использует метод compare в Compator для сравнения элементов, поэтому принимает в качестве аргумента компаратор.
 *
 * Например:
 *
 * Comparator<Integer> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
 *
 * Сначала создастся компаратор, у которого будет использован метод compare(), а только потом компаратор, который учитывает null.
 *
 * @author Ilya Kaltygin
 */
public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
