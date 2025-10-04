package org.desviante.string.ComparingStringsIgnoringWhitespaces;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input1NoSpaces = input1.replaceAll("\\s", "");//remove espaços em branco
        String input2 = scanner.nextLine();
        String input2NoSpaces = input2.replaceAll("\\s", "");
        System.out.println(input1NoSpaces.compareToIgnoreCase(input2NoSpaces) == 0);
    }
}