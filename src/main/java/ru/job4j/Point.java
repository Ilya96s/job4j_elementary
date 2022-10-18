package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultx = x2 - x1;
        double resulty = y2 - y1;
        resultx = Math.pow(resultx, 2);
        resulty = Math.pow(resulty, 2);
        double result = resultx + resulty;
        result = Math.sqrt(result);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 2, 9);
        System.out.println("result (1, 1) to (2, 3) " + result);
    }
}
