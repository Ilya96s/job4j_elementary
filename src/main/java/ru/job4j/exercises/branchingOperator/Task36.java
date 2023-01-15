package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод sameNums(int number), который принимает целое двузначное положительное число.
 *
 * Задание: Написать код, который проверяет, состоит ли это число из одинаковых цифр. Вывести в консоль "Да", если состоит, и "Нет", если не состоит.
 *
 * Например, для числа 33 вывод будет:
 *
 * Да
 *
 * @author Ilya Kaltygin
 */
public class Task36 {
    public static void sameNums(int number) {
        int number1 = number / 10;
        int number2 = number % 10;
        if (number2 == number1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
