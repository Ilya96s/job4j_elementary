package ru.job4j.exercises.arraysexercise;

/**
 * Задан числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 *
 * @author Ilya Kaltygin
 */
public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
