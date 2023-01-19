package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод isSymmetric(int number), который принимает целое трехзначное положительное число.
 *
 * Трехзначное число является симметричным, если первая и последняя его цифры одинаковы.
 *
 * Задание: Написать код, который проверяет, является ли входящее число симметричным. Если является - вывести "Да", если нет - "Нет".
 *
 * Например, вывод для числа 363 будет:
 *
 * Да
 *
 * @author Ilya Kaltygin
 */
public class Task39 {
    public static void isSymmetric(int number) {
        int last = number % 10;
        int first = number / 100;
        if (last == first) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
