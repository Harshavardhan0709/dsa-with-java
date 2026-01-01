
import java.util.Scanner;

public class SumOfIntegers {
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        System.out.printf("Sum of digits of an intger %d = %d",num,sumOfDigits(num));
    }

}