import java.util.Scanner;

public class CheckEvenOrOdd {
    public static boolean isEven(int number){
        if(number%2!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        System.out.println(isEven(number));
    }
}
