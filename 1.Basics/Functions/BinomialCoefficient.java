
import java.util.Scanner;

public class BinomialCoefficient {
    public static void binomialCoEfficient(int n, int r) {
        int nFactorial = findFactorial(n);
        int rFactorial = findFactorial(r);
        int nMinusRfactorial = findFactorial(n - r);
        int binomialCoEfficient = nFactorial / (rFactorial * nMinusRfactorial);
        System.out.printf("Factorial of %dC%d is: %d",n,r,binomialCoEfficient);
    }

    public static int findFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        System.out.print("Enter r value:");
        int r = sc.nextInt();
        binomialCoEfficient(n, r);
    }
}
