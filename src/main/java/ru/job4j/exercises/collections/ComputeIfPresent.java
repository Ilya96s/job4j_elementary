package ru.job4j.exercises.collections;

import java.util.Map;

/**
 * Необходимо пройтись по первому отображению и к значению имени добавить значение фамилии, чтобы на выходе получилось отображение - ключ(число) - значение(строка - имя + фамилия).
 *
 * @author Ilya Kaltygin
 */
public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name,
            Map<Integer, String> surname) {
        for (Integer key : name.keySet()) {
            name.computeIfPresent(key, (k, v) -> v + " " + surname.get(k));
        }
        return name;
    }
}
