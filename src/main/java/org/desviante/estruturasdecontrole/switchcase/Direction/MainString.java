package org.desviante.estruturasdecontrole.switchcase.Direction;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String direction = scanner.nextLine();
        switch (direction) {
            case "1 - up":
                System.out.println("move up");
                break;
            case "2 - down":
                System.out.println("move down");
                break;
            case "3 - left":
                System.out.println("move left");
                break;
            case "4 - right":
                System.out.println("move right");
                break;
            case "0 - do not move":
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}
