package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод isEnough(int pupils, int desks), который принимает 2 целых числа - количество учеников в классе и количество парт соответственно.
 *
 * Задание: Написать код, который выводит в консоль "Да", если парт в классе хватит на всех учеников, иначе вывести "Нет".
 *
 * Примечание: за одной партой могут сидеть только 2 ученика.
 *
 * @author Ilya Kaltygin
 */
public class Task28 {
    public static void isEnough(int pupils, int desks) {
        System.out.println(desks >= pupils / 2 ? "Да" : "Нет");
    }
}
