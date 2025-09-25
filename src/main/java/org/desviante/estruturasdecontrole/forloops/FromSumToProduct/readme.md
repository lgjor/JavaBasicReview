# From sum to product

You have a loop for calculating the sum of integer numbers in the range from start to end inclusively.

```
int accumulator = 0;                    // (1)
for (int i = start; i <= end; i++) {    // (2)
accumulator += i;                       // (3)
}
```

The result is stored in the accumulator variable. Assume that the start and end variables are already declared as some integer values, so that start <= end.

You need to change two lines in this code to calculate the multiplication of integer numbers in this range.

Fill in the blanks to so that the following code performs the required multiplication.