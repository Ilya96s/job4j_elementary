package ru.job4j.exercisescycles;

/**
 * Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
 */
public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 1;
        for (int i = a; i <= b; i++) {
            rsl *= i;
        }
        return rsl;
    }
}
