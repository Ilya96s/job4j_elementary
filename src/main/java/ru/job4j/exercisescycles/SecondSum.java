package ru.job4j.exercisescycles;

/**
 * Даны два целых положительных числа a и b (b > a). Надо сложить каждое второе число в диапазоне [a, b] начиная с первого
 *
 * Например,
 *
 * [1, 2] => 1
 *
 * [1, 3] => 1 + 3 = 4
 *
 * [1, 5] => 1 + 3 + 5 = 9
 *
 * [0, 5] => 0 + 2 + 4 = 6
 *
 * @author Ilya Kaltygin
 */
public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i += 2) {
            sum += i;
        }
        return sum;
    }
}
