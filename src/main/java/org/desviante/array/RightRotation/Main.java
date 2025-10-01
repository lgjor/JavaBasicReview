package org.desviante.array.RightRotation;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static int[] rotate(int[] arr, int steps) {
        for (int i=steps; i>0; i--){
            int mem = arr[arr.length-1]; // memorizo o último elemento
            // rodo os demais
            for (int j=arr.length-1; j>=0; j--){
                if (j==0){
                    arr[j]=mem;
                    break;
                }
                arr[j]=arr[j-1];
            }
        }
        return arr;
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}