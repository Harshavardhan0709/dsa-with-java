import java.util.Scanner;

public class Mulitiplication {
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf("Multiplication of entered number %d is: \n",number);
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d =%d \n",number,i,number*i);
        }
    }
}
