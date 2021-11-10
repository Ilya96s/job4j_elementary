package ru.job4j.condition;

public class Games {
    public static void permossion(boolean allowByParent, boolean hasMoney) {
        boolean rsl = allowByParent && hasMoney;
        if (rsl) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
        Games.permossion(true, true);
        Games.permossion(true, false);
        Games.permossion(false, true);
        Games.permossion(false, false);
    }
}
