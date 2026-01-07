

import java.util.Arrays;

public class MoveZerosAndSort {
    public static void moveZerosAndSort(int nums[]) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[x] = nums[i];
                x++;
            }
        }
        Arrays.sort(nums, 0, x);// Sorting non Zero elements
        // Fill all the remaining elements with Zero
        for (int i = x; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 0, 8, 0, 9, 8, 0, 34, 5, 6, 7, 0, 3 };
        moveZerosAndSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
