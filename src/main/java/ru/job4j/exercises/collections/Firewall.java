package ru.job4j.exercises.collections;

import java.util.Set;

/**
 * Метод принимает строку, которая является названием статьи, а также коллекцию Set в которой содержатся слова, которые не должны содержаться в названиях статей, чтобы мы могли сконцентрироваться на материале изучения. Метод должен вернуть:
 *
 * 1. Если в строке нет ни одного слова из коллекции Set, то метод должен вернуть строку: Вы сделали правильный выбор!
 *
 * 2. Если в строке имеется хоть одно из слов из коллекции Set, метод должен вернуть строку: Выберите другую статью...
 *
 * @author Ilya Kaltygin
 */
public class Firewall {
    public static String checkName(String s, Set<String> words) {
        boolean flag = false;
        String[] strings = s.split(" ");
        for (String string : strings) {
            if (words.contains(string)) {
                flag = true;
                break;
            }
        }
        return flag ? "Выберите другую статью..." : "Вы сделали правильный выбор!";
    }
}
