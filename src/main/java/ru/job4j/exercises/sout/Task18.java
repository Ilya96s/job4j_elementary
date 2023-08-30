package ru.job4j.exercises.sout;

import java.util.Scanner;

/**
 * @author Ilya Kaltygin
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        System.out.println(a * 4);// периметр квадрата
        System.out.printf("%.1f%n",(2 * Math.PI * r));// длина окружности
        System.out.printf("%.1f%n",(Math.PI * Math.pow(r, 2)));// площадь круга
    }
}
