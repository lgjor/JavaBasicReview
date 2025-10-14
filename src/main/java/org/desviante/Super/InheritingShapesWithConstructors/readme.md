# Inheriting shapes with constructors 

Create a base class called Shape with a constructor that takes the shape's name as a parameter. Then create a derived class called Rectangle that inherits from Shape and has a constructor that takes the shape's name, width, and height as parameters. The Rectangle constructor should call the base class constructor using the super keyword. Finally, create a Rectangle object and print out its name, width, and height.

## Sample Input 1:

Square
5
5

## Sample Output 1:

Name: Square
Width: 5
Height: 5


```Java
import java.util.Scanner;

// Define the base class Shape
class Shape {
    // TODO: Add a constructor that takes the shape's name as a parameter

    // TODO: Add a getter method to retrieve the shape's name

}

// Define the derived class Rectangle
class Rectangle extends Shape {
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    // TODO: Call the base class constructor using the super keyword

    // TODO: Add getter methods to retrieve the rectangle's width and height

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the shape's name, width, and height from the user input

        // TODO: Create a Rectangle object using the user input

        // TODO: Print out the rectangle's name, width, and height

    }
}
```