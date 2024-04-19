import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;

        int numDigits = countDigits(num);

        int lastDigits = square % (int)Math.pow(10, numDigits);

        return lastDigits == num;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}