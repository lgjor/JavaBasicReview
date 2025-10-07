package org.desviante.arraymultidimensional.FindTheCorners;

import java.util.Arrays;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        final int firstElement = 0;
        final int lastRow = twoDimArray.length - 1;
        final int lastCol = twoDimArray[0].length - 1;
        int[] firstLine = new int[2];
        int[] lastLine = new int[2];
        firstLine[0] = twoDimArray[firstElement][firstElement];
        firstLine[1] = twoDimArray[firstElement][lastCol];
        lastLine[0] = twoDimArray[lastRow][firstElement];
        lastLine[1] = twoDimArray[lastRow][twoDimArray[lastRow].length - 1];
        System.out.println(firstLine[firstElement] + " " + firstLine[1]);
        System.out.println(lastLine[firstElement] + " " + lastLine[1]);
    }
    public static void main(String[] args) {
        int[][] array = {
                    {1, 0},
                    {0, 0},
                    {3, 0},
                    {5, 9}
                        };
         printCorners(array);
    }

}
