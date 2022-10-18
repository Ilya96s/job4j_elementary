package ru.job4j.exercises.arraysexercise;

/**
 * Метод возвращает индекс элемента, который является максимальным из двух
 *
 * @author Ilya Kaltygin
 */
public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }
}
