package ru.job4j.exercises.arraysexercise;

/**
 * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве нечетные числа в порядке возрастания их индексов. Для вывода использовать System.out.println()
 *
 * @author Ilya Kaltygin
 */
public class OddPrint {
    public static void print(int[] array) {
        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
