package ru.job4j.exercises.branchingOperator;

/**
 * Ниже представлен метод maxDigit(int number), который принимает целое двузначное положительное число.
 *
 * Задание: Написать код, который выводит на консоль наибольшую из цифр этого числа. Если цифры равны - вывести "Равны".
 *
 * Например, вывод для числа 37 будет:
 *
 * 7
 *
 * @author Ilya Kaltygin
 */
public class Task38 {
    public static void maxDigit(int number) {
        int number1 = number / 10;
        int number2 = number % 10;
        if (number2 == number1) {
            System.out.println("Равны");
        } else if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

    public static void main(String[] args) {
        Task38.maxDigit(43);
    }
}
