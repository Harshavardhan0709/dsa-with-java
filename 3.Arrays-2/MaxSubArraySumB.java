
//Time complexity-O(n^3)
//Space complexity -O(1)

public class MaxSubArraySumB {
    public static void getMaxSubArraySum(int[] numbers) {
        int n = numbers.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum subarray sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        getMaxSubArraySum(arr);
    }
}
