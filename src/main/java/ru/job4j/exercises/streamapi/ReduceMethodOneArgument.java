package ru.job4j.exercises.streamapi;

import java.util.List;

/**
 * В Stream есть метод reduce(BinaryOperator<T> operator). Этот метод находит первый элемент стрима, он становится результатом, а потом уже начинает применять оператор к последующим элементам.
 *
 * В Stream есть метод reduce(BinaryOperator<T> operator). Этот метод находит первый элемент стрима, он становится результатом, а потом уже начинает применять оператор к последующим элементам.
 *
 * @author Ilya Kaltygin
 */
public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((n1, n2) -> n1 * n2).get();
    }
}
