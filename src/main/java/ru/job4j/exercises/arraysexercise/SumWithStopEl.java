package ru.job4j.exercises.arraysexercise;

/**
 * Необходимо реализовать метод который принимает 2 параметра:
 *
 * 1. Массив целочисленный значений data.
 *
 * 2. Целое число el, которое мы будем искать в массиве data.
 *
 * При этом должны выполниться следующие условия:
 *
 * 1. Метод должен вернуть сумму элементов массива data, которые находятся до элемента el
 *
 * 2. Если окажется что сумма элементов - четное число - необходимо вернуть это число, иначе - 0.
 *
 * @author Ilya Kaltygin
 */
public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        int x = 0;
        while (data[x] != el) {
            sum += data[x];
            x++;
        }
        if (sum % 2 == 0) {
            return sum;
        } else {
            return 0;
        }
    }
}
