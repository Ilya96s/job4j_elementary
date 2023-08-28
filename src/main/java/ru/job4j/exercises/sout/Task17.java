package ru.job4j.exercises.sout;

import static java.lang.Math.pow;

public class Task17 {
    public static void main(String[] args) {
        int x = 6;
        System.out.print(x + System.lineSeparator() +
                (int) pow(x, 2) + System.lineSeparator() +
                (int) pow(x, 3));
    }
}
