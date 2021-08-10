package ru.job4j.calculator;
//import ru.job4j.math.MathFunction;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("Результат расчета сложения метода суммы и метода умножения двух чисел равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета сложения метода разности и метода деления двух чисел равен: " + sumDifferenceAndDivide(6, 2));
        System.out.println("Результат расчета сложения всех операций двух чисел: " + sumAllOperations(10, 2));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferenceAndDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sumAndMultiply(first, second) + sumDifferenceAndDivide(first, second);
    }
}
