package ru.job4j.calculator;

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Job4j";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
}
