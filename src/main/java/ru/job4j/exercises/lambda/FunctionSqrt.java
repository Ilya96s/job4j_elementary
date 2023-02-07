package ru.job4j.exercises.lambda;

import java.util.function.Function;

/**
 * Написать лямбда выражение, которое извлекает корень квадратный из числа
 *
 * @author Ilya Kaltygin
 */
public class FunctionSqrt {

    public static double calculate(double x) {
        return calculate(Math::sqrt, x);
    }
    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
