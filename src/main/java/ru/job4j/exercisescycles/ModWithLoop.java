package ru.job4j.exercisescycles;

/**
 * Есть операция остаток от деления %. Вам даны два целых положительных числа числа n и d (d > 0). n это делимое, d это делитель.
 * Нужно не используя операцию %, найти остаток от деления.
 *
 * @author Ilya Kaltygin
 */
public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        return n;
    }
}
