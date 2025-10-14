package org.desviante.Super.InheritingShapesWithConstructors;

public class Shape {
    protected String name;
    // Add a constructor that takes the shape's name as a parameter
    public Shape(String name){
        this.name = name;
    }

    // Add a getter method to retrieve the shape's name
    public String getName() {
        return name;
    }
}
