package ru.job4j.exercises.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


/**
 * Метод принимает строку, которая может содержать несколько пробелов, однако в ней отсутствуют знаки препинания.
 *
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется наибольшее количество раз. Если окажется что таких символов несколько - необходимо вернуть первый из символов. Чтобы обеспечить сортировку символов - собирайте исходную строку в TreeMap(), в которой ключ - это символ, значение - количество. Перед тем как собирать строку ее нужно привести к нижнему регистру, удалить пробелы.
 *
 * @author Ilya Kaltygin
 */
public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        str = str.toLowerCase().replace(" ", "");
        char[] chars = str.toCharArray();
        Map<Character, Integer> characterIntegerMap = new TreeMap();
        for (char ch : chars) {
            characterIntegerMap.putIfAbsent(ch, 1);
            characterIntegerMap.computeIfPresent(ch, (key, value) -> value = value + 1);
        }
        var maxValue = characterIntegerMap.values().stream().max(Comparator.naturalOrder()).get();
        for (Character ch : characterIntegerMap.keySet()) {
            if (maxValue.equals(characterIntegerMap.get(ch))) {
                return ch;
            }
        }
        return ' ';
    }
}
