package org.desviante.array.SumOfMultiplesOf3InAnArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int [] myArray = new int[n];

        // use a loop to read the array elements
        // use a loop to calculate the sum of elements that are multiples of 3
        int sum = 0;
        for (int i=0; i<n; i++){
            myArray[i]=scanner.nextInt();
            if (myArray[i]%3==0){
                sum+=myArray[i];
            }
        }
        System.out.println(sum);

        // close the scanner
        scanner.close();
    }
}
