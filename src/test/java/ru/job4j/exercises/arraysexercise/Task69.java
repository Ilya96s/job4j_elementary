package ru.job4j.exercises.arraysexercise;

/**
 * 2. Вывести значения массива, начиная с последней ячейки
 *
 * @author Ilya Kaltygin
 */
public class Task69 {
    public static void array(int[] arr) {
        String whiteSpace = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(whiteSpace + arr[i]);
            whiteSpace = " ";
        }
        System.out.println();
    }
}
