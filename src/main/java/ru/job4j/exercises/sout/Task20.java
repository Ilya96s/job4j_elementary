package ru.job4j.exercises.sout;

/**
 * Написать код, который выводит на экран в первой строке через пробел значения входящих переменных, во второй ― сумму этих переменных, в третьей - произведение этих переменных.
 *
 * @author Ilya Kaltygin
 */
public class Task20 {
    public static void print(int x, int y) {
        int sum = x + y;
        int umn = x * y;
        System.out.println("Переменные: " + x + " " + y);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + umn);
    }
}
