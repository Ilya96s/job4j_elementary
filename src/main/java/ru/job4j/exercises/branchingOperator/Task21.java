package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод signCheck(int number1, int number2), который принимает 2 целых числа.
 *
 * Задание: Написать код, который выводит в консоль "Одинаковые", если знаки входящих чисел равны, иначе -  "Разные". Если хотя бы одно из чисел - ноль, вывести "Некорректно".
 *
 * @author Ilya Kaltygin
 */
public class Task21 {
    public static void signCheck(int number1, int number2) {
        if (number1 >= 0 && number2 >= 0 || number1 < 0 && number2 < 0) {
            System.out.println("Одинаковые");
        } else {
            System.out.println("Разные");
        }
    }
}
