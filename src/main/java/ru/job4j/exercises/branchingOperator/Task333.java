package ru.job4j.exercises.branchingOperator;

/**
 *
 * Ниже представлен метод evenAmount(int number), который принимает целое положительное трехзначное число.
 *
 * Задание: Написать код, который высчитывает количество четных цифр во входящем трехзначном числе, и выводит результат в консоль.
 *
 * Переменная counter - это счетчик наших четных цифр.
 *
 * Например, для числа 650 вывод должен быть:
 *
 * 2
 *
 * @author Ilya Kaltygin
 */
public class Task333 {
    public static void evenAmount(int number) {
        int counter = 0;
        int tempNum = number;
        while (tempNum > 0) {
            if ((tempNum % 10) % 2 == 0) {
                counter++;
            }
            tempNum /= 10;
        }
        System.out.println(counter);
    }
}
