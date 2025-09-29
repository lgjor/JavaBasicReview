package org.desviante.typecasting.SequentialConversions;

public class Main {
    public static void main(String[] args) {
        int intValue = 128;
        char charValue = (char) intValue;
        short shortValue = (short) charValue;
        byte byteValue = (byte) shortValue;

        System.out.println("Type conversion: " + intValue + "," + charValue + "," + shortValue + "," + byteValue);
    }
}
