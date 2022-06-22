package ru.job4j.exercises.arraysexercise;

/**
 * Метод проверяет, является ли последовательноть чцелочисленных значений во входящем массиве, последовательностью чисел Фибоначчи
 */
public class Fibonacci {
    public static boolean checkArray(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 2; i++) {
            int prev = array[i];
            int next = array[i + 1];
            int sum = array[i + 2];
            if (sum != prev + next) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
