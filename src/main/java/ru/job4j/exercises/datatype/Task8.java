package ru.job4j.exercises.datatype;

/**
 * Что если нам нужно получить число без его знака? Например, получить 3, если имеется -3. Для этого мы можем использовать функцию модуля. Модуль числа это его часть без знака. Модуль положительного числа равен ему самому.
 *
 * В Java модуль можно получить с использованием функции Math.abs. Синтаксис такой
 *
 * double переменная = Math.abs(число);
 *
 * Например,
 *
 * double result = Math.abs(-3); // = 3
 *
 * Ниже приведен код. Вам нужно его раскоментировать и получить модуль -5
 *
 * @author Ilya Kaltygin
 */
public class Task8 {
    public static void main(String[] args) {
        double result = Math.abs(-5);
        System.out.println(result);
    }
}
