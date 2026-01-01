import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch='A';
        System.out.print("Enter number of lines:");
        int n = sc.nextInt();
        //InvertedCharacterPattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(ch+" ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
