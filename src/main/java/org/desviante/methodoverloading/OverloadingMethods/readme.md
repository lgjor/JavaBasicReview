# Overloading methods

Here is a method that takes a long value and returns the max value of the long type minus the given number.

public static long getMaxMinusCurrent(long val) {
return Long.MAX_VALUE - val;
}
Explain code
Overload this method with one new method. The method should take an int and return the max value of the int type minus the given value.

For the method, the type of result value must be the same as the type of the parameter.

## Sample Input 1:

long
10

### Sample Output 1:

9223372036854775797

## Sample Input 2:

int
8

### Sample Output 2:

2147483639