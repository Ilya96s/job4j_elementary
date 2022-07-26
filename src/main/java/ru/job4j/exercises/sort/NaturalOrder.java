package ru.job4j.exercises.sort;

import java.util.Comparator;

/**
 * Существует понятие naturalOrder(). Дословно естественный порядок.
 *
 * Например:
 *
 *  - естественный порядок чисел это порядок возрастания: 1 2 3
 *
 *  - естественный порядок строк это лексикографический порядок: "a", "b"
 *
 * Существует одноименный метод Comparator.naturalOrder(), этот метод возвращает компаратор, основанный на реализации метода compareTo() у типа, который его вызывает.
 *
 * Если вызвать этот метод для числа, например для int, произойдет autoboxing к Integer, и будет использована реализация compareTo в классе Integer.
 *
 * Ваша задача получить компаратор естественного порядка для строки.
 *
 * @author Ilya Kaltygin
 */
public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
