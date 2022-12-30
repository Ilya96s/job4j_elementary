package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод zeroCheck(int number), который принимает целое число.
 *
 * Задание: Написать код, который выводит в консоль слово "Zero", если число - ноль, либо "Not zero", если число не ноль.
 *
 * @author Ilya Kaltygin
 */
public class Task16 {
    public static void zeroCheck(int number) {
        System.out.println(number == 0 ? "Zero" : "Not zero");
    }
}
