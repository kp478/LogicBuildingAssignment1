import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RamanujanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isRamanujanNumber(num)) {
            System.out.println(num + " is a Ramanujan number.");
        } else {
            System.out.println(num + " is not a Ramanujan number.");
        }
    }

    public static boolean isRamanujanNumber(int num) {
        Map<Integer, Set<Pair>> map = new HashMap<>();


        for (int i = 1; i * i * i < num; i++) {
            for (int j = i + 1; i * i * i + j * j * j <= num; j++) {
                int sum = i * i * i + j * j * j;
                if (!map.containsKey(sum)) {
                    map.put(sum, new HashSet<>());
                }
                map.get(sum).add(new Pair(i, j));
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key).size() >= 2) {
                return true;
            }
        }

        return false;
    }

    static class Pair {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
