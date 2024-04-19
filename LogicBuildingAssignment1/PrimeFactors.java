import java.util.Scanner;
public class PrimeFactors {
    public static void printPrimeFactors(int n) {
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Prime factors of " + num + " is/are: ");
        printPrimeFactors(num);
    }
}