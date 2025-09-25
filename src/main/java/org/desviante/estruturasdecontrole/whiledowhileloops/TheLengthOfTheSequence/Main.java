package org.desviante.estruturasdecontrole.whiledowhileloops.TheLengthOfTheSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int elem = scanner.nextInt();
        while (elem > 0) {
            count++;
            elem = scanner.nextInt();
        }
        System.out.println(count);
        scanner.close();
    }
}
