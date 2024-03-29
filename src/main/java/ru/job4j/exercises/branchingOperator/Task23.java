package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод isExist(int num1, int num2), который принимает 2 целых числа - числитель дроби и ее знаменатель соответственно.
 *
 * Задание: Написать код, который выводит в консоль "Да", если дробь существует, иначе "Нет".
 *
 * Примечание: Дробь существует, если ее знаменатель не равен нулю.
 *
 * @author Ilya KAltygin
 */
public class Task23 {
    public static void isExist(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
