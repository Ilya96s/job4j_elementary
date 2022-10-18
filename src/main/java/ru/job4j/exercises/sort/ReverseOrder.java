package ru.job4j.exercises.sort;
/**
 * Если нам нужно получить порядок элементов обратный naturalOrder(), можно использовать метод Comparator.reverseOrder(). Этот метод также использует реализацию метода compareTo().
 *
 * Например, если реализация такая o1.compareTo(o2), то метод reverseOrder() вернет компаратор, основанный на сравнении o2.compareTo(o1).
 *
 * Ваша задача получить обратный компаратор для строки
 *
 * @author Ilya Kaltygin
 */

import java.util.Comparator;

public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        return Comparator.reverseOrder();
    }
}
