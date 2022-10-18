package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

public static double difAndDevide(double first, double second) {
        return difference(first, second)
                + devide(first, second);
}

public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + devide(first, second);
}

    public static void main(String[] args) {
        System.out.println("Результат рассчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат рассчета равен: " + difAndDevide(10, 20));
        System.out.println("Результат всех рассчетов равен: " + MathCalculator.all(10, 20));
    }
}
