package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод numSquare(int number), который принимает целое число.
 *
 * Задание: Написать код, который выводит в консоль квадрат этого числа, если оно отрицательное, иначе вывести "Ошибка".
 *
 * Например, для числа 2 вывод будет:
 *
 * Ошибка
 *
 * @author Ilya Kaltygin
 */
public class Task33 {
    public static void numSquare(int number) {
        System.out.println(number < 0 ? number * number : "Ошибка");
    }
}
