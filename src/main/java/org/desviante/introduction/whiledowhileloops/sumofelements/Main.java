package org.desviante.introduction.whiledowhileloops.sumofelements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualNumber = scanner.nextInt();
        int sum = 0;
        while (actualNumber > 0){
            sum +=actualNumber;
            actualNumber = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
