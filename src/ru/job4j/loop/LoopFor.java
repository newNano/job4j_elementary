package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        for (int index = 0; index <= 5; index++) {
            System.out.println(index);
        }
        System.out.println();
        int i;
        boolean result;
        for (i = 0; result = i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнения цикла равно: " + result);
        System.out.println();
        int index = 10;
        System.out.println("Использование префиксной формы записи!");
        System.out.println("Результат вычисления: " + ++index);
        System.out.println("Значение переменной: " + index);
        System.out.println();
        System.out.println("Использование постфиксной формы записи!");
        System.out.println("Результат вычисления: " + index++);
        System.out.println("Значение переменной: " + index);
        System.out.println();
        System.out.println("Вывод чисел от 5 до 10:");
        for (int j = 5; j <= 10; j++) {
            System.out.println(j);
        }
    }
}
