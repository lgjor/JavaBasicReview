package org.desviante.StringBuilder.ConcatAllStringsWithoutDigits;

import java.util.Scanner;

public class ConcatenateStringsProblem {
    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            for (char c : string.toCharArray()){
                if (!Character.isDigit(c)){
                    builder.append(c);
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
