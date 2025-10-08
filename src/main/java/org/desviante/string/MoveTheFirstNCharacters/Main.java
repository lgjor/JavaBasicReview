package org.desviante.string.MoveTheFirstNCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int n = scanner.nextInt();
        if (n > 0 && n <= word.length()) {
            String substring = word.substring(n) + word.substring(0, n);
            System.out.println(substring);
        } else {
            System.out.println(word);
        }
        scanner.close();
    }
}
