package ru.job4j.exercises.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * необходимо раскомментировать код, заполнить пропуски (обозначены ...) так, чтобы в консоль были выведены все значения отображения. При этом необходимо использовать метод keySet() и get().
 *
 * @author Ilya Kaltygin
 */
public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer i : map.keySet()) {
            System.out.println(i + " - " + map.get(i));
        }
    }
}
