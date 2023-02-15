package ru.job4j.exercises.lambda;

import java.util.function.Predicate;

/**
 * Необходимо создать предикат Predicate, который проверяет, что строка пустая, для этого нужно использовать метод isEmpty() в классе String
 *
 * @author Ilya Kaltygin
 */
public class MRPredicate {
    public static Predicate<String> predicate() {
        Predicate<String> predicate = s -> s.isEmpty();
        return  predicate;
    }
}
