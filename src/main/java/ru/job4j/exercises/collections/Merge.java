package ru.job4j.exercises.collections;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * метод принимает отображение - число(id пользователя) - строка(имя пользователя),
 * а также список пользователей. Возникла проблема - данные в отображении хранились так
 * долго и ранее не было предусмотрено, что помимо имени необходимо хранить еще и фамилию.
 * Необходимо обновить информацию - если такой пользователь уже существует (проверять по ключу) - то необходимо к имени добавить фамилию, если нет - то сначала добавить пользователя - ключ id, значение - имя пользователя, а потом только обновить и добавить фамилию. При решении используйте методы putIfAbsent() и merge().
 *
 * @author Ilya Kaltygin
 */
public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User u : users) {
            names.putIfAbsent(u.getId(), u.getName());
            names.merge(u.getId(), u.getSurname(), (name, surname) -> name + " " + surname);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
