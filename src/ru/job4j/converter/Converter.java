package ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {

        float rub = 140;
        float euroFromRub = Converter.rubleToEuro(rub);
        System.out.println(rub +" rubles are " + euroFromRub + " euros.");

        rub = 180;
        float dollarFromRub = Converter.rubleToDollar(rub);
        System.out.println(rub + " rubles are " + dollarFromRub + " dollars.");

        float euro = 1;
        float dollarFromEuro = Converter.euroToDollar(euro);
        System.out.println(euro + " euro are " + dollarFromEuro + " dollars.");

        euro = 150;
        float rubFromEuro = Converter.euroToRub(euro);
        System.out.println(euro + " euro are " + rubFromEuro + " rubles");

        float dollar = 1;
        float euroFromDollars = Converter.dollarToEuro(dollar);
        System.out.println(dollar + " dollar are " + euroFromDollars + " euros");

        dollar = 50;
        float rubFromDollars = Converter.dollarToRub(dollar);
        System.out.println(dollar + " dollar are " + rubFromDollars + " rub");
    }

    private static float dollarToRub(float dollar) {
        float rsl = dollar * 60;            //формула перевода доллара в рубли.
        return rsl;
    }

    private static float dollarToEuro(float dollar) {
        float rsl = (float) 60 / 70 * dollar;  //формула перевода доллара в евро.
        return rsl;
    }

    private static float euroToRub(float euro) {
        float rsl = euro * 70;  //формула перевода евро в рубли.
        return rsl;
    }

    private static float euroToDollar(float euro) {
        float rsl = (float) 70 / 60 * euro; //формула перевода евро в доллары.
        return rsl;
    }

    public static float rubleToEuro(float rub) {
        float rsl = rub / 70; //формула перевода рублей в евро.
        return rsl;
    }

    public static float rubleToDollar(float rub) {
        float rsl = rub / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }
}
