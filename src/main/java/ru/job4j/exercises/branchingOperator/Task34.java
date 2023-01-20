package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод chairsCheck(int pupils, int chairs), который принимает 2 целых положительных числа - количество учеников в классе и количество стульев соответственно.
 *
 * Задание: Написать код, который проверяет соответствие входящих значений, и выводит в консоль "Лишних стульев: n", если стульев больше, чем учеников, выводит "Не хватает стульев: n", если учеников больше, чем стульев, либо выводит "Соответствует", если числа равны. n - количество стульев.
 *
 * Например, для чисел 12 и 10 вывод будет:
 *
 * Не хватает стульев: 2
 *
 * @author Ilya Kaltygin
 */
public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils > chairs) {
            System.out.println("Не хватает стульев: " + (pupils - chairs));
        } else if (chairs > pupils) {
            System.out.println("Лишних стульев: " + (chairs - pupils));
        } else {
            System.out.println("Соответствует");
        }
    }
}
