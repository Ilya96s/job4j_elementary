package ru.job4j.exercises.collections;

import java.util.List;

/**
 * @author Ilya Kaltygin
 */
public class ArProgression {
    public static int checkData(List<Integer> data) {
        boolean rsl = true;
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            if (i >=1 && i < data.size() - 1 && data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                rsl = false;
                break;
            }
            sum += data.get(i);
        }
        return rsl ? sum : 0;
    }
}
