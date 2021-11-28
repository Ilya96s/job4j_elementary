package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int line = 0; line < array.length; line++) {
            for (int cell = 0; cell < array.length; cell++) {
                array[line][cell] = (line + 1) * (cell + 1);
            }
        }
        return array;
    }
}