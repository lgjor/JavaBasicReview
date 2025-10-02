# Two numbers never occur next to each other

Write a program that reads an array of integers and two numbers n and m. The program must check that n and m never occur next to each other (in any order) in the array.

## Input data format

- The first line contains the size of an array.
- The second line contains elements of the array.
- The third line contains two integer numbers n and m.
- All numbers in the same line are separated by the space character.

## Output data format

The result is a single boolean value true if n and m never occur next to each other; otherwise, it is false.

## Sample Input 1:

3
1 2 3
2 3

## Sample Output 1:

false

## Sample Input 2:

3
1 2 3
3 4

## Sample Output 2:

true

## Sample Input 3:

10
3 4 5 6 3 4 6 4 4 8
5 8

## Sample Output 3:

true