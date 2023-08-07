package ru.job4j.exercises.collections;

import java.util.*;

/**
 * необходимо реализовать словарь. Метод принимает массив строк. Необходимо перебрать массив и добавить строки в карту таким образом, чтобы ключом был первый символ строки, а значением - список строк, которые начинаются на первый символ строки.
 *
 * @author Ilya Kaltygin
 */
public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> stringList = new HashMap<>();
        for (String s : strings) {
            stringList.put(String.valueOf(s.charAt(0)), Arrays.stream(strings)
                    .filter(str -> str.startsWith(String.valueOf(s.charAt(0))))
                    .toList());
        }
        return stringList;
    }
}
