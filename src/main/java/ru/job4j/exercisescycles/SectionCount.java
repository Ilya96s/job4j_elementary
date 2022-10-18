package ru.job4j.exercisescycles;

/**
 * Даны два целых положительных числа length, section. length это расстояние. Вам нужно не используя операцию деления найти
 * сколько раз отрезок длиной section помещает в length. Нужно использовать цикл while
 *
 * Например,
 *
 * Для length = 2, section = 1 => 2
 *
 * Для length = 3, section = 2 => 1
 *
 * @author Ilya Kaltygin
 */
public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            length = length - section;
            count++;
        }
        return count;
    }
}
