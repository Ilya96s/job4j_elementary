package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод gradeCheck(int grade), который принимает целое число.
 *
 * Задание: Написать код, который проверяет, является ли входящее число реальной оценкой, то есть находится в диапазоне от 1 до 5. Вывести в консоль "Да", если является, и "Нет", если не является.
 *
 * Например, для числа -2 вывод будет:
 *
 * Нет
 *
 * @author Ilya Kaltygin
 */
public class Task35 {
    public static void gradeCheck(int grade) {
        System.out.println(grade >= 1 && grade <= 5 ? "Да" : "Нет");
    }
}
