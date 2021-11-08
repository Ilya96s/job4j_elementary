package ru.job4j.condition;

public class Max {
        public static int max(int left, int right) {
            int max = left > right ? left : right;
            return max;
        }

    public static void main(String[] args) {
        int max = Max.max(4, 2);
        System.out.println(max);
    }
}
