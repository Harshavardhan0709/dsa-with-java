
//Time complexity-O(n^2)
//Space complexity -O(n)

public class MaxSubArraySumP {
    public static void getMaxSubArraySum(int[] numbers) {
        int n = numbers.length;
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[n];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                currentSum = i == 0 ? prefix[i] : prefix[j] - prefix[i - 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        getMaxSubArraySum(arr);
    }
}
