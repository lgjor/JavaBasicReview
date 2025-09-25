package org.desviante.estruturasdecontrole.whiledowhileloops.SmallestMultipleBy3LargerThanN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        int x = n;
        if (n > 0) {
            while (x>=n && x%3!=0)
            {
                x++;
            }
            System.out.println(x);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}