import java.util.Scanner;

public class PositiveOrNegativeInteger {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scannerObject.nextInt();
        if (a >= 0) {
            System.out.println("Postive");
        } else {
            System.out.println("Negative");
        }
        scannerObject.close();
    }

}
