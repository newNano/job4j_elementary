package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        double rsl = TrgArea.calculateArea(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

    public static double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
