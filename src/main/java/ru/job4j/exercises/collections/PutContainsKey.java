package ru.job4j.exercises.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * в классе определенно 2 метода, оба принимают список пользователей.
 *
 * 1. Выполняет вставку значений в отображение без проверки содержится ли такой ключ уже в отображении.
 *
 * 2. Выполняет вставку значений в отображение с проверкой содержится ли такой ключ уже в отображении.
 *
 * Необходимо перебрать весь список и добавить пользователей в отображение, при этом в качестве ключа использовать id пользователя, значения - объект типа User. В задании необходимо использовать методы, описанные в выше.
 *
 * @author Ilya Kaltygin
 */
public class PutContainsKey {
    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user : list) {
            rsl.put(user.id(), user);
        }
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user : list) {
            if (!rsl.containsKey(user.id())) {
                rsl.put(user.id(), user);
            }
        }
        return rsl;
    }

    public record User(int id, String name) {
    }
}
