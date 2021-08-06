package ru.job4j.condition;

public class SqArea {

    public static void main(String[] args) {
        double result1 = SqArea.calculateSquare(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result1);
    }

    public static double calculateSquare(double p, double k) {
        double h = p / (2 * (k + 1));
        double len = h * k;

        double square = len * h;
        return square;
    }

}
