import java.io.*;
import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b) {
        int result = Math.min(a,b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result --;
        }

        return  result;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values for a and b: ");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a,b));
    }
}
