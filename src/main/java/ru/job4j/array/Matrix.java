package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int line = 0; line < size; line++) {
            for (int cell = 0; cell < size; cell++) {
                array[line][cell] = (line + 1) * (cell + 1);
            }
        }
        return array;
    }
}