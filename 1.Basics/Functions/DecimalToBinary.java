import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int decNum) {
        int number = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNum = binNum + lastDigit * ((int) Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        System.out.printf("Binary number for entered decimal number %d is: %d", number, binNum);
    }

    public static void main(String[] args) {
        System.out.print("Enter decimal number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        decToBin(number);
    }
}
