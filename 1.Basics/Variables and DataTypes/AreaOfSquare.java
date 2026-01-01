

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a square:");
		int side = sc.nextInt();
		System.out.printf("Area of square with side %d is:%d",side,(side*side));
	}
}
