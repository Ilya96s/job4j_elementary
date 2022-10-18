package ru.job4j;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(186);
        System.out.println("Man 186 is " + man);
        double woman = Fit.womanWeight(166);
        System.out.println("Woman 166 is " + woman);
    }
}
