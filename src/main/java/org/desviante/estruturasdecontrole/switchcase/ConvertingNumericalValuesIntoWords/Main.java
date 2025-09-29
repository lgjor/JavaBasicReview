package org.desviante.estruturasdecontrole.switchcase.ConvertingNumericalValuesIntoWords;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        String numberInWords = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Invalid number";
        };

        System.out.println(numberInWords);
    }
}