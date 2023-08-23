package ru.job4j.exercises.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
 *
 * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре. Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 *
 * Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true, иначе - false.
 *
 * @author Ilya Kaltygin
 */
public class Isogram {
    public static boolean checkString(String s) {
        String[] strings = s.split("");
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        return stringSet.size() == s.length();
    }
}
