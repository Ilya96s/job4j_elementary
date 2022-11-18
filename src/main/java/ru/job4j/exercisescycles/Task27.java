package ru.job4j.exercisescycles;

import java.util.StringJoiner;

/**
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 *
 * Задание: Написать код, который выводит в консоль через пробел все целые числа из диапазона -num...num (не включая крайние значения диапазона).
 *
 * Например, для числа 2 вывод будет:
 *
 * -1 0 1
 *
 * @author Ilya Kaltygin
 */
public class Task27 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = -num + 1; i < num; i++) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
    }
}

