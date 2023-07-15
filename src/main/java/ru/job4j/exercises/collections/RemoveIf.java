package ru.job4j.exercises.collections;

import java.util.List;

/**
 * необходимо реализовать метод, который вернет список строк, которые состоят из 5 и более символов.
 *
 * @author Ilya Kaltygin
 */
public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(el -> el.length() < 5);
        return list;
    }
}
