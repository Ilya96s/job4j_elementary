package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод numDecrease(int number), который принимает целое число.
 *
 * Задание: Написать код, который уменьшает число на единицу, если оно как минимум трехзначное и положительное.
 * Результат вывести в консоль. Если число не проходит по условию, то вывести это же число без изменений.
 *
 * @author Ilya Kaltygin
 */
public class Task18 {
    public static void numDecrease(int number) {
        if (number < 100) {
            System.out.println(number);
        } else {
            System.out.println(number - 1);
        }
    }
}
