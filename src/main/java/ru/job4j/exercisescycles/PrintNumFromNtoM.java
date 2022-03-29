package ru.job4j.exercisescycles;

/**
 * Вывести на консоль числа от N до M. M не входит.
 */
public class PrintNumFromNtoM {
    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }
}
