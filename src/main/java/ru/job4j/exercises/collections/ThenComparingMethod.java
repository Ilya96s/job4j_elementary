package ru.job4j.exercises.collections;

import java.util.Comparator;
import java.util.Objects;

/**
 * Необходимо написать компаратор, который будет упорядочивать пользователей сначала по возрастанию по имени, а потом по убыванию по возрасту.
 *
 * @author Ilya Kaltygin
 */
public class ThenComparingMethod {

    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        @Override
        public int compareTo(User o) {
            return 0;
        }

    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        return Comparator.comparing(User::getName);
    }

    public static Comparator<User> descByAge() {
        return (o1, o2) -> Integer.compare(o2.getAge(), o1.getAge());
    }
}
