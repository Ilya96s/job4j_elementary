package ru.job4j.exercises.lambda;

import java.util.function.Predicate;

/**
 * Написать лямбда выражение, которое проверяет, что число положительное
 *
 * @author Ilya Kaltygin
 */
public class PredicateCheckPositive {
    public static boolean check (int num) {
        return check(n -> n > 0, num);
    }

    public static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
