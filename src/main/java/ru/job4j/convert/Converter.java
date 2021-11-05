package ru.job4j.convert;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 80;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float rubles = 240;
        float expected = 3;
        float out = Converter.rubleToEuro(rubles);
        boolean passed = expected == out;
        System.out.println("240 rubles are 3. Test result : " + passed);
        rubles = 210;
        expected = 3;
        out = Converter.rubleToDollar(rubles);
        passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);
    }
}
