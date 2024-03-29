package ru.job4j.exercises.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Редукция может быть использована не только для сведения в коллекцию, но и для сведению например, к числу, строке и тд. Например, нам нужен коллектор, который поделит 100 на все числа в стриме. Например, для 4, и 5, (100 / 4) / 5 = 5.
 *
 * @author Ilya Kaltygin
 */
public class CollectorArithmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> {
            int number = 1;
            for (Integer n : ns) {
                number *= n;
            }
            return number;
        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
