package ru.job4j.exercises.collections;

import java.util.List;

/**
 * метод принимает в качестве параметров список и индекс элемента который необходимо заменить.
 * необходимо дописать метод так, чтобы сначала удалялся последний элемент в списке, а потом
 * этим элементом заменить элемент по индексу, который пришел в параметрах метода. Необходимо учесть,
 * что извне могут передать индекс, который превышает значение размера списка.
 * Чтобы этого избежать - необходимо добавить проверку валидности входных параметров.
 *
 * @author Ilya Kaltygin
 */
public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String removed = list.remove(list.size() - 1);
        if (index <= list.size() - 1) {
            list.set(index, removed);
        }
        return list;
    }
}
