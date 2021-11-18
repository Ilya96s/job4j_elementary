package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent = (amount * percent) / 100;
        double debts = amount + percent;
        while (debts >= 0) {
           debts = debts - salary;
           year++;
            System.out.println(year);
        }
        return year;
    }
}