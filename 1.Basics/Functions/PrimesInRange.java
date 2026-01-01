import java.util.Scanner;

public class PrimesInRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int endValue) {
        for (int i = 2; i <= endValue; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter end number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        primesInRange(number);
    }
}
