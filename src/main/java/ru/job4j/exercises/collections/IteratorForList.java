package ru.job4j.exercises.collections;

import java.util.Iterator;
import java.util.List;

/**
 * необходимо расскомментировать код, заполнить места пропуска (обозначены ...). Метод должен пройти по всему списку, вывести информацию что следующий элемент есть(в виде значения true), а также значение этого элемента. Также после обхода списка необходимо вывести информацию, что больше элементов нет. Используйте методы, которые были описаны выше.
 *
 * @author Ilya Kaltygin
 */
public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + true + ", this element is " + iterator.next());
        }
        System.out.println("Next element has - " + false);
    }
}
