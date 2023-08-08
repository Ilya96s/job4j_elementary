package ru.job4j.exercises.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные. При реализации необходимо игнорировать пробелы во входной строке.
 *
 * Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки, а значением - список индексов, под которыми этот символ (если таких символов несколько) входит в исходную строку. Важно: строчные и прописные символы считаются разными символами.
 *
 * @author Ilya kaltygin
 */
public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                map.merge(s.charAt(i), new ArrayList<>(List.of(i)), (oldList, newList) -> {
                    oldList.add(newList.get(0));
                    return oldList;
                });
            }
        }
        return map;
    }
}
