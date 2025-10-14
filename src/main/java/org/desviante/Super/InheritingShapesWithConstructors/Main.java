package org.desviante.Super.InheritingShapesWithConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the shape's name, width, and height from the user input
        String shapeName = scanner.nextLine();
        int shapeWidth = scanner.nextInt();
        int shapeHeight = scanner.nextInt();

        // Create a Rectangle object using the user input
        Rectangle rectangle = new Rectangle(shapeName, shapeWidth, shapeHeight);

        // Print out the rectangle's name, width, and height
        System.out.println("Name: "+rectangle.name);
        System.out.println("Width: "+rectangle.width);
        System.out.println("Height: "+rectangle.height);
    }
}
