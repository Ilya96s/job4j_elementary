package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = SqArea.square(10, 1);
        System.out.println(" p = 10, k = 1, s = 6.25, real = " + result1);
        double result2 = SqArea.square(5, 3);
        System.out.println(" p = 5, k = 3, s = 1.17, real = " + result2);
    }
}
