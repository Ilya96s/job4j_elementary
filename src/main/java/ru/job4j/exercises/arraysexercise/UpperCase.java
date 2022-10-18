package ru.job4j.exercises.arraysexercise;

/**
 * Дана строка, записанная в виде массив символов. Ваша задача создать новую строку, в которой будут в символы исходной в верхнем регистре. Если символ не является буквой, например цифры или -, то просто записать в результат.
 *
 * Например, для a-123-B, получить A-123-B
 *
 * Использовать доп. методы
 *
 * Character.isLowerCase(c), где c исходный символ
 *
 * Character.toUpperCase(c), где c исходный символ
 *
 * @author Ilya Kaltygin
 */
public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i])) {
                result[i] = Character.toUpperCase(string[i]);
            } else {
                result[i] = string[i];
            }
        }
        return result;
    }
}
