package ru.job4j.exercisescycles;

/**
 * Дано целое число n (> 0). Нужно вывести делители числа.
 * Делитель это число на которое делится заданное число
 */
public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
