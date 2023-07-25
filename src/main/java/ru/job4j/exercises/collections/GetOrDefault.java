package ru.job4j.exercises.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * необходимо реализовать метод, который позволит добавить элемент list(значение) с ключом index в хранилище store только в том случае, если такого ключа пока еще нет в хранилище. Метод getValue() должен вернуть значение которое соответствует ключу index, если такого ключа нет - необходимо вернуть пустой список.
 *
 * @author Ilya Kaltygin
 */
public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        store.putIfAbsent(index, list);
    }

    public List<String> getValue(int index) {
        return store.getOrDefault(index, List.of());
    }
}
