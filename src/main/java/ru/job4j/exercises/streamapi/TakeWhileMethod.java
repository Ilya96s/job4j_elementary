package ru.job4j.exercises.streamapi;

import java.util.List;

/**
 * Метод takeWhile() позволяет брать из стрима только первые элементы, которые удовлетворяют определенному условию. Если условие перестает выполняться, то оставшиеся элементы отбрасываются.
 *
 * Стоит отметить, что для корректной работы, этого метода нужно чтобы часть элементов, которая удовлетворяет условию должна идти "спереди". Поэтому нужно либо точно знать, что элементы отсортированы, либо использовать метод sorted() для сортировки.
 *
 * Например,
 *
 * List.of("abc", "bc", "ab", "cd", "a").sorted().takeWhile(s -> s.startWith("a")) // в стриме останутся только "a", "ab", "abc"
 *
 * @author Ilya Kaltygin
 */
public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .takeWhile(i -> i < 0)
                .toList();
    }
}
