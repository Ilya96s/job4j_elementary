package ru.job4j.exercises.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Класс Stream работает с объектами. Для представления стрима примитивов в Java есть свои классы: IntStream, LongStream, DoubleStream.
 *
 * Их можно создавать как мы создавали раньше. Чаще всего приходиться создавать стрим из массива примитивов. Для этого лучше всего подходит метод Arrays.stream(). Например
 *
 * int[] data = {1, 2, 3};
 *
 * IntStream steam = Arrays.stream(data);
 *
 * @author Ilya Kaltygin
 */
public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        IntStream stream = Arrays.stream(data);
        return  stream;
    }
}
