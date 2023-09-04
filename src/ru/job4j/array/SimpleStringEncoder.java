package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == symbol) {
                counter++;
            } else {
                result = counter == 1 ? result + "" + symbol : result + "" + symbol + counter;
                counter = 1;
                symbol = c;
            }
        }
        return counter == 1 ? result + "" + symbol : result + "" + symbol + counter;
    }
}
