package ru.job4j.exercises.arraysexercise;

/**
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 *
 * Например,
 *
 * {"one", "two", "three"} => "one two three"
 *
 * можно использовать метод String.join
 *
 * @author Ilya Kaltygin
 */
public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                stringBuilder.append(words[i]).append(" ");
            } else {
                stringBuilder.append(words[i]);
            }
        }
        return stringBuilder.toString();
    }
}
