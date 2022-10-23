package ru.job4j.exercises.arraysexercise;

/**
 * 26. Создание неоднородного двумерного массива.
 *
 * @author Ilya Kaltygin
 */
public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][] {{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
