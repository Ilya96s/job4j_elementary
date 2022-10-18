package ru.job4j.exercisescycles;

public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = a; i <= b; i++) {
            if (i >= 10) {
                System.out.print(i);
            }
        }
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(1, 15);
    }
}
