package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 10, 2, 7);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(5, 45, 23, 8);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(2, 9, 2, 11);
        System.out.println("result2 (0, 0) to (2, 0) " + result2);
    }
}

