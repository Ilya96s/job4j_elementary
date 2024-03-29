package ru.job4j.exercises.collections;

import org.junit.Test;
import ru.job4j.exercises.collections.PutContainsKey.User;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PutContainsKeyTest {

    @Test
    public void addNewElement() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey.addNewElementWithCheck(list);
        Map<Integer, User> expected = Map.of(1, one, 2, two);
        assertThat(map, is(expected));
    }

    @Test
    public void addNewElementWithoutCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey.addNewElementWithoutCheck(list);
        Map<Integer, User> expected = Map.of(1, three, 2, two);
        assertThat(map, is(expected));
    }

}