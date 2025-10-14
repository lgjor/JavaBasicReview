package org.desviante.inheritance.CalculatingTrianglePerimeter;

import java.util.Scanner;

public class Main {

    // Base class Polygon
    static class Polygon {
        private int sideLength;

        // Method to set the length of sides
        public void setSideLength(int sideLength) {
            this.sideLength = sideLength;
        }

        // Method to get the length of sides
        public int getSideLength() {
            return sideLength;
        }
    }

    // Derived class Square
    static class Square extends Polygon {
        protected int squareArea(int side){
            return side*side;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideLength = scanner.nextInt();

        // Create an instance of Square
        Square square = new Square();

        // Set the side length
        square.setSideLength(10);


        // Calculate and print the area
        System.out.println(square.squareArea(sideLength));
    }
}