package ru.job4j.exercises.streamapi;

import java.util.stream.Stream;

/**
 * Бывает, что возникает ситуация, что нужно обойти массив, при этом зная индекс.
 * Т.е. так как мы это делаем с обычным for. Arrays.stream() вернет нам стрим элементов массива, но что если нам нужен еще индекс?
 *
 * Есть метод Stream.iterate() который позволяет сгенерировать нам стрим, по заданным условиям.
 * Его мы можем использовать для нашей задачи, мы генерируем стрим индексов, а потом их используем для обхода массива. Синтаксис такой
 *
 * Stream.iterate(начальное значение счетчика, условие, увеличение счетчика),
 * когда условие перестанет выполнятся перестанет генерироваться индекс.
 *
 * Пример,
 *
 * Stream.iterate(0, i -> i < 5, i -> i + 1) => сгенерируются 0, 1, 2, 3, 4
 *
 * Обратите внимание, что увеличение счетчика нельзя писать так i++, потому что i++ эквивалентно i += 1, а это
 * предполагает изменение переменной внутри лямбда, что нельзя делать
 *
 * нужно заполнить так что обход был начиная с 0, причем обходился бы только каждый второй элемент.
 */
public class StreamIterate {
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(i -> System.out.println(data[i]));
    }
}
