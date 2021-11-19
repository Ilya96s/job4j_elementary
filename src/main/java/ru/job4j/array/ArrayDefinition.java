package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива павен: " + ages.length);
        System.out.println("Размер массива павен: " + surnames.length);
        System.out.println("Размер массива павен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Petr";
        names[2] = "Nikolay";
        names[3] = "Ilya";
        String name1 = names[0];
        System.out.println(name1);
        String name2 = names[1];
        System.out.println(name2);
        String name3 = names[2];
        System.out.println(name3);
        String name4 = names[3];
        System.out.println(name4);
    }
}