package ru.job4j.exercisescycles;

/**
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 *
 * Например,
 *
 * {"one", "two", "three"} => "one two three"
 *
 * @author Ilya Kaltygin
 */
public class WordsToText {
    public static String convert(String[] words) {
        return String.join(" ", words);
    }
}
