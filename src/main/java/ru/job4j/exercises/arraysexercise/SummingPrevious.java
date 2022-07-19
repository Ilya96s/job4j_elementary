package ru.job4j.exercises.arraysexercise;

/**
 * Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n, первый элемент которого равен a,
 * второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
 *
 * @author Ilya Kaltygin
 */
public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        int sum = a + b;
        for (int i = 2; i < rsl.length; i++) {
            rsl[i] = sum;
            sum += rsl[i];
        }
        return rsl;
    }
}
