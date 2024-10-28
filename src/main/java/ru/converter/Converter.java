package ru.converter;

public class Converter {

    public static float rubleToEuro(float value1) {
        return value1 / 70;
    }

    public static float rubleToDollar(float value2) {
        return value2 / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}