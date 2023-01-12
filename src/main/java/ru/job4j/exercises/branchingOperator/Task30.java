package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод numModify(int number), который принимает целое число.
 *
 * Задание: Написать код, который делает следующее:
 *
 * - Если число отрицательное, превращает его в положительное.
 *
 * - Если число положительное, превращает его в ноль.
 *
 * Например, при входящем числе -6 вывод будет:
 *
 * 6
 *
 * @author Ilya Kaltygin
 */
public class Task30 {
    public static void numModify(int number) {
        System.out.println(number >= 0 ?  0 : number * -1);
    }
}
