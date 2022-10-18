package ru.job4j.exercisescycles;

public class SweetPrice {
    public static void out(int price) {
        int rsl = 0;
        for (int i = 1; i <= 5; i++) {
            rsl = price * i;
            System.out.println(rsl);
        }
    }
}
