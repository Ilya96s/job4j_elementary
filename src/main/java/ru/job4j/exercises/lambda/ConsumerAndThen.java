package ru.job4j.exercises.lambda;

import java.util.function.Consumer;

/**
 * Необходимо написать метод, который совмещает два Consumer, первый выводит строку через System.out.print,
 * а второй приписывает переход на новую строку через System.out.println.
 *
 * @author Ilya Kaltygin
 */
public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = obj -> System.out.print(input);
        Consumer<String> ln = obj -> System.out.println();
        return print.andThen(ln);
    }
}
