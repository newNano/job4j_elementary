package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        String wordStr = String.valueOf(word);
        String postStr = String.valueOf(post);
        boolean result = wordStr.endsWith(postStr);
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
