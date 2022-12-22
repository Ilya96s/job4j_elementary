package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод signCheck(int number), который принимает целое число.
 *
 * Задание: Написать код, который выводит в консоль одно из слов: "Положительное", "Ноль" или "Отрицательное", в зависимости от значения входящего числа.
 *
 * @author Ilya Kaltygin
 */

public class Task17 {
    public static void signCheck(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
