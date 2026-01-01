
import java.util.Scanner;

public class BillCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost of pen:");
		float penCost = sc.nextFloat();
		System.out.println("Enter cost of pencil:");
		float pencilCost = sc.nextFloat();
		System.out.println("Enter cost of eraser:");
		float eraserCost = sc.nextFloat();
		float totalBillAmount=pencilCost+penCost+eraserCost;
		float totalBillIncludingGST=(0.18f*totalBillAmount)+totalBillAmount;
		System.out.println("Total Bill is:\u20B9"+totalBillAmount);
		System.out.println("Final price including 18% GST is :\u20B9"+totalBillIncludingGST);
	}
}
