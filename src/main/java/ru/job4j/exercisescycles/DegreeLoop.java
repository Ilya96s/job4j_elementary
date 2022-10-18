package ru.job4j.exercisescycles;

/**
 * Дано целое число a и целое число n (> 0). Найти a в степени n: a^n = a·a· . . . ·a (числа a перемножаются n раз).
 */
public class DegreeLoop {
    public static int calculate(int a, int n) {
        /**
         * Math.pow() возвращает double, поэтому необходимо сделать явное приведение к типу int
         */
        return (int) Math.pow(a, n);
    }
}
