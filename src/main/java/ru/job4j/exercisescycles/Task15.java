package ru.job4j.exercisescycles;

import java.util.StringJoiner;

/**
 *  Написать код, который выводит в консоль через пробел все положительные трехзначные числа в диапазоне от второго числа (включая) до первого числа (не включая) в убывающем порядке. Перед началом вывода нужно вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 *
 * @author Ilya Kaltygin
 */
public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner rsl = new StringJoiner(" ");
        a = a > 100 ? a + 1 : 100;
        for (int i = b; i >= a; i--) {
            rsl.add(String.valueOf(i));
        }
        System.out.println("Старт\n" + rsl + "\nФиниш");
    }
}
