import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printNumbersRecursively(1, n);
    }

    public static void printNumbersRecursively(int current, int n) {
        if (current > n) {
            return;
        }

        System.out.println(current);
        printNumbersRecursively(current + 1, n);
    }
}