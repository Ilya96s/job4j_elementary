package ru.job4j.exercisescycles;

import java.util.StringJoiner;

/**
 * Написать код, который выводит в консоль все однозначные положительные числа.
 * Перед началом вывода нужно вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш",
 * тоже в отдельной строке.
 *
 * @author Ilya Kaltygin
 */
public class Task16 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i < 10; i++) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
