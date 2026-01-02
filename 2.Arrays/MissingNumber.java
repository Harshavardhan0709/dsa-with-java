//Time Complexity - O(n)
//Space Complexity -O(1)

public class MissingNumber {
    public static int findMissingNumber(int numbers[], int totalSum) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4 };
        int arrayLength = arr.length;
        int totalSum = ((arrayLength + 1) * (arrayLength + 2)) / 2;
        System.out.println("Missing number is: " + findMissingNumber(arr, totalSum));
    }
}