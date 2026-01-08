//Time Complexity-O(n)
//Space Complexity-O(1)

public class MaxConsecutiveOnes {
    public static int countMaxOnes(int nums[]) {
        int currCount = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currCount++;
            } else {
                maxCount = Math.max(currCount, maxCount);
                currCount = 0;
            }
        }
        return Math.max(maxCount, currCount);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        int arr1[] = { 1, 1 };
        System.out.println(countMaxOnes(arr));
        System.out.println(countMaxOnes(arr1));
    }
}
