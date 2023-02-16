package ru.job4j.exercises.lambda;

import java.util.function.Function;

/**
 * Необходимо создать Function через ссылку на метод. В качестве функции нужно использовать Math.sqrt()
 *
 * @author Ilya Kaltygin
 */
public class MRFunction {
    public static Function<Double, Double> apply() {
        Function<Double, Double> function = Math::sqrt;
        return function;
    }
}
