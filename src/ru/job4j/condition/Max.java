package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = max(a, b);
        System.out.println("Максимальное число между (" + a + "," + b + ") = " + c);
    }

    public static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}
