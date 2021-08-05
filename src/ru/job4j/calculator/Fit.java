package ru.job4j.calculator;

public class Fit {

    public static void main(String[] args) {

        short height = 180;
        double manWeight  = Fit.calculateManWeight(height);
        System.out.println("Man " + height + " is " + manWeight + " kg");

        height = 165;
        double womanWeight = Fit.calculateWomanWeight(height);
        System.out.println("Woman " + height + " is " + womanWeight + " kg");

    }

    public static double calculateManWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double calculateWomanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
