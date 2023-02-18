package ru.job4j.exercises.lambda;

import java.util.Optional;

/**
 * Необходимо написать:
 *
 * 1. Написать метод indexOf(). Он ищет индекс по значению. Если индекс не найден, должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
 *
 * 2. В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optinal, то метод должен вернуть -1, в противном случае сам индекс
 *
 * @author Ilya Kaltygin
 */
public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        if (indexOf(data, el).isEmpty()) {
            return -1;
        } else {
            return indexOf(data, el).get();
        }
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = Optional.of(i);
            }
        }
        return optional;
    }
}
