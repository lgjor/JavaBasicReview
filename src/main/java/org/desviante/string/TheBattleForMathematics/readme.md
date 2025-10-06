# The battle for Mathematics

A mysterious number known as the "PI number" has been discovered on the planet Mathematics. The inhabitants of the planet are afraid of its endless digits, which never end. It is up to you to round this number and bring harmony back to the planet Mathematics. Your task is to set the accuracy of the variable pi to three decimal places and output the result. We highly recommend that you use printf or format to get more practice.

## Sample Input 1:

```Java
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        System.out.printf("%.4f", pi);

    }
}
```

## Sample Output 1:

3.142