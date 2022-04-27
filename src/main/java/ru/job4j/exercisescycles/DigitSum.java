package ru.job4j.exercisescycles;

/**
 * Дано число, нужно получить сумму его цифр
 *
 * Например,
 *
 * 12 => 1 + 2 => 3
 *
 * @author Ilya Kaltygin
 */
public class DigitSum {
    public static int sum(int sum) {
        int rsl = 0;
        while (sum != 0) {
            rsl += sum % 10;
            sum /= 10;
        }
        return rsl;
    }
}
