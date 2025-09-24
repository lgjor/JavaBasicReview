package org.desviante.introduction.whiledowhileloops.LargestElementOfASequence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestElement = scanner.nextInt();
        int actualElement = largestElement;
        while ( actualElement > 0 ) {
            if ( actualElement > largestElement ){
                largestElement = actualElement;
            }
            actualElement = scanner.nextInt();
        }
        System.out.println(largestElement);
        // start coding here
    }

}
