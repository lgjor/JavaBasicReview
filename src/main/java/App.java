import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num = 034;
        System.out.println(num);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int index = java.util.Arrays.binarySearch(numbers, target);
        java.util.Arrays.sort(numbers);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
    }
}