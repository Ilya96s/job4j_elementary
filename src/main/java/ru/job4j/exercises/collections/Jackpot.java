package ru.job4j.exercises.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 *
 * Метод принимает массив строк, который содержит последовательность элементов игровой комбинации. Метод должен вернуть true - если комбинация является выигрышной.
 *
 * @author Ilya Kaltygin
 */
public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(combination));
        return stringSet.size() == 1;
    }
}
