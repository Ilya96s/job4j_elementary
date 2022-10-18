package ru.job4j.exercisescycles;

/**
 * Метод принимает массив целочисленных значений, при этом каждый элемент массива означает количество часов, которые работник отработал в каждый день недели. Работник может работать и в выходные. При этом оплачивается труд следующим образом:
 *
 * 1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.
 *
 * 2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.
 *
 * 3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и за сверхурочные.
 *
 * Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 *
 * @author Ilya Kaltygin
 */
public class WeeklySalary {
    public static int calculate(int[] hours) {
        int regular = 10;
        int extra = 15;
        int doubleRegular = 20;
        int doubleExtra = 30;
        int salary = 0;

        for (int i = 0; i < hours.length; i++) {
            salary += switch (i) {
                case 0, 1, 2, 3, 4 -> hours[i] > 8 ? (hours[i] - 8) * extra + 8 * regular : hours[i] * regular;
                case 5, 6 -> hours[i] > 8 ? (hours[i] - 8) * doubleExtra + 8 * regular : hours[i] * doubleRegular * 2;
                default -> 0;
            };
        }
        return salary;
    }
}
