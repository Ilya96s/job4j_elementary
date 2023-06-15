package ru.job4j.exercises.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Известно, что работникам организации, у которых > 2 детей положены льготы для детей. Но не всем детям, а тем, что младше 15. Некоторые работники не знают подробности акции. Они решили прийти в отдел организации, который отвечает за льготы и узнать положены ли льготы их детям, если да, то каким именно. Вам дан список работников и паспорт интересующего работника. Нужно найти список детей этого работника, которым положены льготы. В системе уже есть метод поиска по паспорту, вам нужно используя этот метод дописать метод поиска детей
 *
 * @author Ilya Kaltygin
 */
public class OptionalFilter {
    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        return findByPassport(workers, passport)
                .stream()
                .flatMap(worker -> worker.getChildren().stream()
                        .filter(z -> worker.getChildren().size() > 2)
                        .filter(child -> child.getAge() < 15))
                .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }
}
