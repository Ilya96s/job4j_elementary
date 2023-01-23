package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод numsCompare(int number), который принимает целое двузначное положительное число.
 *
 * Задание: Написать код, который проверяет, является ли первая цифра этого числа (десятки) больше второй (единицы). Вывести в консоль "Да", если является, и "Нет", если не является.
 *
 * Например, вывод для числа 11 будет:
 *
 * Нет
 *
 * @author Ilya Kaltygin
 */
public class Task37 {
    public static void numsCompare(int number) {
        if (number / 10 > number % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
