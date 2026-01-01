
import java.util.Scanner;

public class WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int dayNumber = sc.nextInt();
        String weekDay = "";
        switch (dayNumber) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                System.out.println("Invalid Input please enter 1-7");
        }
        System.out.println(weekDay);
    }
}
