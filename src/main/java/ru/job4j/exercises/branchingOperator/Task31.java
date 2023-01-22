package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод numCompare(int num1, int num2), который принимает 2 целых числа.
 *
 * Задание: Написать код, который выводит эти числа на консоль в порядке возрастания в одной строке и в порядке убывания в другой строке.
 *
 * Например, для чисел 2 и -1 вывод будет:
 *
 * -1 2
 *
 * 2 -1
 *
 * @author Ilya Kaltygin
 */
public class Task31 {
    public static void numCompare(int num1, int num2) {
        System.out.println(num1 > num2 ? "" + num2 + " " + num1 : "" + num1 + " " + num2);
        System.out.println(num1 < num2 ? "" + num2 + " " + num1 : "" + num1 + " " + num2);
    }
}
