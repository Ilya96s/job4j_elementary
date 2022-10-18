package ru.job4j.exercises.arraysexercise;

/**
 * 1. Вывести значения массива, начиная с первой ячейки
 *
 * @author Ilya kaltygin
 */
public class Task68 {
    public static void array(int[] arr) {
        String whiteSpace = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(whiteSpace + arr[i]);
            whiteSpace = " ";
        }
        System.out.println();
    }
}

