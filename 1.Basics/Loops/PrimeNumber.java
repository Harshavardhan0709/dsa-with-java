
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is prime or not:");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println(n + " is prime number");
        } else if (n == 1) {
            System.out.println(n + " is neither prime nor composite");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime");
        }
    }
}
