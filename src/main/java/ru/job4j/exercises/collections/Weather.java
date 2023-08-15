package ru.job4j.exercises.collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Метод принимает список объектов Info. При этом эти объекты содержат два поля:
 *
 * 1. city - название города, где производились наблюдения;
 *
 * 2. rainfall - количество осадков, которые выпали в этом городе за период наблюдения.
 *
 * Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info, в котором будет указано название города наблюдения и общее количество осадков за период наблюдения. В качестве промежуточного хранилища используйте LinkedHashMap (города должны находиться в списке в порядке их добавления).
 *
 * @author Ilya Kaltygin
 */
public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Info info : list) {
            map.merge(info.getCity(), info.getRainfall(), (oldInfo, newInfo) -> oldInfo + newInfo);
        }
        return map.keySet().stream()
                .map(s->new Info(s, map.get(s)))
                .toList();
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
