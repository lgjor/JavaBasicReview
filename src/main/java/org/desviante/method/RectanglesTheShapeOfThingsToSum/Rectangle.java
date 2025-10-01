package org.desviante.method.RectanglesTheShapeOfThingsToSum;

public class Rectangle {
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        System.out.println(calculateRectangleArea(5.0, 3.0));
    }
}