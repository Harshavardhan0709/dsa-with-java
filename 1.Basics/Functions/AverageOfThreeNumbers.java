
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void average(double  num1, double  num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.printf("Average of %f, %f and %f is: %f", num1, num2, num3, average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number:");
        double num3 = sc.nextDouble();
        average(num1, num2, num3);
    }
}
