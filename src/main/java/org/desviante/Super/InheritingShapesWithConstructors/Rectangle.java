package org.desviante.Super.InheritingShapesWithConstructors;

public class Rectangle extends Shape {
    protected int width;
    protected int height;

    // Add a constructor that takes the shape's name, width, and height as parameters
    public Rectangle(String name, int width, int height){
        // Call the base class constructor using the super keyword
        super(name);
        this.width = width;
        this.height = height;
    }

    // Add getter methods to retrieve the rectangle's width and height
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
