
import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        if (number == 0) {
            System.out.printf("Factorial of number %d is: %d", number, 1);
        } else {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.printf("Factorial of number %d is:%d", number, fact);
        }
    }
}
