package ru.job4j.exercises.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 *
 * Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 *
 * @author Ilya Kaltygin
 */
public class Pangram {
    public static boolean checkString(String s) {
        char[] chars = s.trim().toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c : chars) {
            set.add(c);
        }
        return set.size() == chars.length;
    }
}
