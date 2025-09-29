package org.desviante.typecasting.CastingLongToByteWithIntermediateInt;

public class Main {
    public static void main(String[] args) {
        long longValue = 300;
        int intValue = (int) longValue;
        byte byteValue = (byte) intValue;
        System.out.println("Long value: " + longValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Byte value: " + byteValue);
    }
}
