package ru.job4j.exercises.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * необходимо раскомментировать код, заполнить коллекцию строками от one до five. Потом заполнить пропуски (обозначены ...) так, чтобы в цикле печатались строки пока они есть, при этом на каждой итерации выводилось сообщение, что значение существует в наборе.
 *
 * @author Ilya Kaltygin
 */
public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
