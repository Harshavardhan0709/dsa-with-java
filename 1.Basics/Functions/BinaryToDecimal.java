import java.util.Scanner;

public class BinaryToDecimal {

    public static void binToDecm(int binNum) {
        int number = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * ((int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.printf("Decimal number for entered binary number %d is: %d", number, decNum);
    }

    public static void main(String[] args) {
        System.out.print("Enter binary number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        binToDecm(number);
    }
}
