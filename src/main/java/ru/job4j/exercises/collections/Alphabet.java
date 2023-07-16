package ru.job4j.exercises.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * необходимо реализовать метод, который принимает строку, которое является одним словом, без знаков препинания цифр и пробелов. Метод должен вернуть новую строку, в которой все символы исходной строки будут расставлены в алфавитном порядке.
 *
 * Для разделения строки на подстроки используйте метод split(), добавьте все элементы в коллекцию List<String>, отсортируйте в порядке возрастания - используйте метод sort, в который передадите компаратор. Новую строку сформируйте с помощью StringBuilder.
 *
 * @author Ilya Kaltytin
 */
public class Alphabet {
    public static String reformat(String s) {
        List<String> list = Arrays.asList(s.split(""));
        list.sort(Comparator.naturalOrder());
        StringBuilder str = new StringBuilder();
        for (String el : list) {
            str.append(el);
        }
        return str.toString();
    }
}
