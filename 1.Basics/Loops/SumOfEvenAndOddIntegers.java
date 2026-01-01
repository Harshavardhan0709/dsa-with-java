
import java.util.Scanner;

public class SumOfEvenAndOddIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Enter 1 to continue 0 to stop");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
        } while (true);
        System.out.println("Sum of even numbers you entered is:" + evenSum);
        System.out.println("Sum of odd numbers you entered is:" + oddSum);
    }
}
