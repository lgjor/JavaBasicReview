package org.desviante.estruturasdecontrole.whiledowhileloops.CelsiusChase;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LIMITTEMP = 100;
        int actualTemperature = scanner.nextInt();
        int maxTemperature = 0;
        while ( actualTemperature < 100 ){
            if ( actualTemperature > maxTemperature){
                maxTemperature = actualTemperature;
            }
            actualTemperature = scanner.nextInt();
        }
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}