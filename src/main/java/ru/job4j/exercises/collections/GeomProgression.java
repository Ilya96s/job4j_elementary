package ru.job4j.exercises.collections;

/**
 * @author Ilya Kaltygin
 */
public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int res = first;
        for (int i = 0; i < count - 1; i++) {
            first *= denominator;
            res += first;
        }
        return res;
    }
}
