package ru.job4j.exercises.arraysexercise;

/**
 * Метод принимает 2 двумерных квадратных массива.Необходимо реализовать метод который осуществит конвертацию двумерного массива
 * в одномерный, при этом необходимо выполнить условия: при переборе двумерных массивов осуществить сравнение элементов, которые стоят
 * на местах с одинаковыми индексами, и вернуть максимальное из сравниваемых значений. Максимальное из двух значений необходимо вставить
 * в результирующий массив.
 *
 * @author Ilya Kaltygin
 */
public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int size = 0;
        for (int i = 0; i < left.length; i++) {
        size += left[i].length;
    }
        int index = 0;
        int[] rsl = new int[size];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                if (left[i][j] > right[i][j]) {
                    rsl[index] = left[i][j];
                    index++;
                } else {
                    rsl[index] = right[i][j];
                    index++;
                }
            }
        }
        return rsl;
    }
}
