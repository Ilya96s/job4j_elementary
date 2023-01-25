package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод changeNum(int num1, double num2, int num3), который принимает 3 положительных числа - целое, дробное и целое соответственно.
 *
 * Задание: Написать код, который производит следующие расчеты: если первое входящее число (num1) - четное, то вывести в консоль произведение num1 и num2, а если нечетное, то вывести сумму чисел num1 и num3.
 *
 * Например, вывод для чисел 2, 2.5, 3 будет:
 *
 * 5.0
 *
 * @author Ilya Kaltygin
 */
public class Task48 {
    public static void changeNum(int num1, double num2, int num3) {
        if (num1 % 2 == 0) {
            System.out.println(num1 * num2);
        } else if (num1 % 2 != 0) {
            System.out.println(num1 + num3);
        }
    }
}
