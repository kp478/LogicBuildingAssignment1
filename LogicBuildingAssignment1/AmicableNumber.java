import java.util.Scanner;

public class AmicableNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
    }

    public static boolean areAmicable(int num1, int num2) {
        int sum1 = sumOfProperDivisors(num1);
        int sum2 = sumOfProperDivisors(num2);

        return sum1 == num2 && sum2 == num1;
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum;
    }
}
