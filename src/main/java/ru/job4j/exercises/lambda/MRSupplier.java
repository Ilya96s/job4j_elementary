package ru.job4j.exercises.lambda;

import java.util.function.Supplier;

/**
 * Интерфейс Supplier служит для того, чтобы обернуть логику создания объекта. Он ничего не принимает, только возвращает объект, который ему поручили создать. Ссылки на методы поддерживает метод new, который позволяет нам создать нужный нам объект
 *
 * Например,
 *
 * Supplier<List<String>> supplier = ArrayList::new;
 *
 * List<String> list = supplier.get() // вернет ArrayList
 *
 * Ваша задача вернуть Supplier, который создает пустую строку через new
 *
 * @author Ilya Kaltygin
 */
public class MRSupplier {
    public static Supplier<String> supplier() {
        Supplier<String> supplier = String::new;
        return supplier;
    }
}
