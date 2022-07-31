package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] symbols = name.toCharArray();
        if (symbols[0] < 'a' || symbols[0] > 'z') {
            return false;
        }

        for (int i = 1; i < symbols.length; i++) {
            if (!isCorrectSymbol(symbols[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCorrectSymbol(char symbol) {
        return symbol >= 'a' && symbol <= 'z'
                || symbol >= '0' && symbol <= '9'
                || symbol == '_'
                || symbol == '$';
    }
}
