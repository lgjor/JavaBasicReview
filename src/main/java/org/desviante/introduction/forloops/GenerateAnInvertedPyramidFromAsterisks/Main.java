package org.desviante.introduction.forloops.GenerateAnInvertedPyramidFromAsterisks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int line = n; line > 0; line--){
            for (int col=line; col>0; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
