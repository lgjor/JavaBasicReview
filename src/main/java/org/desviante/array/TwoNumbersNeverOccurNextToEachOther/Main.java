package org.desviante.array.TwoNumbersNeverOccurNextToEachOther;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Lê o tamanho do array
        int size = scanner.nextInt();

        // Cria o array
        int[] array = new int[size];

        // Lê o array
        for (int i=0; i<size; i++){
            array[i]=scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean notFound = true;
        for (int i=0; i<size-1; i++){
            if ( (array[i]==n && array[i+1]==m) || (array[i]==m && array[i+1]==n) ) {
                notFound = false;
                break;
            }
        }
        System.out.println(notFound);
    }
}
