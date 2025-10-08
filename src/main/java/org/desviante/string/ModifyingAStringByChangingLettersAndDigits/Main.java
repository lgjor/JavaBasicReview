package org.desviante.string.ModifyingAStringByChangingLettersAndDigits;

import java.util.Scanner;

public class Main {
    public static String transformString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '0') {
                sb.setCharAt(i, '9');
                // caso especial, e encontrar o z, deve retornar o a, e nao o z+1
            } else if (c == 'z') {
                sb.setCharAt(i, 'a');
            } else if (Character.isDigit(c)) {
                sb.setCharAt(i, (char) (c - 1));
            } else if (Character.isLetter(c)) {
                sb.setCharAt(i, (char) (c + 1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
        input.close();
    }
}