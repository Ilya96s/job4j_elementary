package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int s = 1; s <= n; s++) {
            result = result * s;
        }
        return result;
    }
}
