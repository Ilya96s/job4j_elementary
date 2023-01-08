package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод isEnough(int pupils, int chairs), который принимает 2 целых числа - количество учеников в классе и количество стульев соответственно.
 *
 * Задание: Написать код, который выводит в консоль "Да", если стульев в классе хватит на всех учеников, иначе вывести "Нет".
 *
 * @author Ilya Kaltygin
 */
public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        System.out.println(chairs >= pupils ? "Да" : "Нет");
    }
}
