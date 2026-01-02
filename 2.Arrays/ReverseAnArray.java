
//Time Complexity - O(n)
//Space Complexity -O(1)

public class ReverseAnArray {
    public static void reverseAnArrayUsingForLoop(int[] numbers) {
        System.out.println("For Loop");
        System.out.println("Initial array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n-1-i];
            numbers[n-1-i] = temp;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void reverseAnArrayUsingWhileLoop(int[] numbers) {
        System.out.println("While Loop");
        System.out.println("Initial array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,1,5,6 };
        reverseAnArrayUsingForLoop(arr);
        System.out.println();
        reverseAnArrayUsingWhileLoop(arr);
    }
}
