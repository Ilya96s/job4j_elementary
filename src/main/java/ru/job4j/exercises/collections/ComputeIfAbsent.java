package ru.job4j.exercises.collections;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * метод принимает отображение в котором содержатся пары ключ(число) - значение(строка), при этом строка - это имя пользователя(в отображении они представлены пустой строкой), ключ - его id. Также в качестве аргумента метод принимает список пользователей. Необходимо реализовать метод, который произведет ассоциацию id и name пользователя в отображении. При этом:
 *
 * 1. Если такой ключ уже есть в отображении - метод должен обновить ассоциацию(используйте computeIfPresent()).
 *
 * 2. Если такого ключа нет - метод должен добавить ассоциацию(используйте computeIfAbsent()).
 *
 * @author Ilya Kaltygin
 */
public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            int finalI = i;
            names.computeIfAbsent(users.get(i).getId(), key -> users.get(finalI).getName());
            names.computeIfPresent(users.get(i).getId(), (key, value) -> users.get(finalI).getName());
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
