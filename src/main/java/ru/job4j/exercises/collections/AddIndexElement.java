package ru.job4j.exercises.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Необходимо реализовать метод, который добавляет элемент в список по индексу,
 * при этом он должен добавлять элемент только в том случае, если этого элемента еще нет в коллекции.
 * При этом метод должен вернуть булево значение. Для этого необходимо сравнить размер дубликата списка
 * и списка в который мы добавляем элемент. Используйте методы contains(E e), add(int index, E e), size().
 *
 * @author Ilya Kaltygin
 */
public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str)) {
            check.add(index, str);
        }
        return list.size()==check.size();
    }
}
