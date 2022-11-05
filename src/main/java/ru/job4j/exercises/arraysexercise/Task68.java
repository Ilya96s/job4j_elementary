package ru.job4j.exercises.arraysexercise;

import java.util.StringJoiner;

/**
 * Необходимо вывести значения массива, начиная с первой ячейки
 *
 * @author Ilya Kaltygin
 */
public class Task68 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            joiner.add(Integer.toString(arr[i]));
        }
        System.out.println(joiner);
    }
}
