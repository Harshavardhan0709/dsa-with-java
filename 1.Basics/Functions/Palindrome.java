import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        int rev=0;
        int temp=number;
        while(number>0){
            int lastDigit=number%10;
            rev=(rev*10)+lastDigit;
            number/=10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
