package org.desviante.typecasting.ConvertingAndPrintingDoubleValuesAsIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        // TODO: Write your code here to read a double from the console
        double doubleValue = scanner.nextDouble();
        // Convert and print the number to an integer.
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        scanner.close();
    }
}