# Size of parts

Imagine that your company has a detector that evaluates the readiness of parts:

If the part it needs to be fixed, the detector prints the number 1.
If the part needs to be removed as a reject, the detector prints the number -1.
If the part is perfect and is ready to be sent, the detector prints 0.

You are given the logs produced by the detector. The number n in the first line indicates the number of parts. Write a program, which counts the total number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects. After that, the program should output these numbers in that order in a single line, separated by blank spaces (see the example, where n = 11).

## Sample Input 1:

11
0
0
-1
-1
0
0
1
0
1
-1
0

### Sample Output 1:

6 2 3