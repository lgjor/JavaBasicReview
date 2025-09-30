package org.desviante.array.CountingCookiesInADigitalJar;

public class Main {
    public static void main(String[] args) {
        int[] productQuantities = {10, 15, 20, 5, 8};
        productQuantities[2] = 25;
        int totalInventory = 0;
        for (int i = 0; i < productQuantities.length; i++) {
            totalInventory += productQuantities[i];
        }
        System.out.println("Total inventory: " + totalInventory);
    }
}