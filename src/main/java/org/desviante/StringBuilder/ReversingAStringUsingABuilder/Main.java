package org.desviante.StringBuilder.ReversingAStringUsingABuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Reverse the string using StringBuilder
        sb.append(inputString).reverse();

        // Print the reversed string
        System.out.println(sb.toString());
    }
}