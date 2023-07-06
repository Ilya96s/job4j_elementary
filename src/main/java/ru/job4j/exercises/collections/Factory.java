package ru.job4j.exercises.collections;

import java.util.List;

/**
 * в методе вам нужно заполнить коллекцию значениями от first до fifth с помощь фабричного метода of(). После этого с помощью цикла for() с индексами и метода get() вывести все элементы.
 *
 * @author Ilya Kaltygin
 */
public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
