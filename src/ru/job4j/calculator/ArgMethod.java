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
    int[] b = {4,5,6};
    int c = b.length;
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
}
