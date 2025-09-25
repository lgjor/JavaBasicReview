package org.desviante.estruturasdecontrole.whiledowhileloops.TheSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumberOfElementsInTheSequence = scanner.nextInt();
        int remainingElements = totalNumberOfElementsInTheSequence;
        int max=0;
        while(remainingElements > 0){
            int number = scanner.nextInt();
            if(number % 4 == 0 && number > max) {
                max = number;
            }
            remainingElements--;
        }
        System.out.println(max);
    }
}
