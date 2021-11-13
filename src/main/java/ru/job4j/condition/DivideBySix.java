package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int num) {
        String rsl;
        if (num % 3 == 0) {
            if (num % 2 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (num % 3 == 0) {
                rsl = "Исходное число делится на 3, но не является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return rsl;
    }
}


