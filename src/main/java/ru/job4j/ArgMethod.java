package ru.job4j;

public class ArgMethod {

    public static void hello(String name) { 
        System.out.print("Hello, " + name); 
    }

    public static void hello(int age) { 
        System.out.println(", age = " + age); 
    }

    public static void main(String[]  args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name);
        ArgMethod.hello(age);
        ArgMethod.hello(name);
        ArgMethod.hello(age);
        ArgMethod.hello(name);
        ArgMethod.hello(age);
        ArgMethod.hello(name);
        ArgMethod.hello(age);
    }
}
