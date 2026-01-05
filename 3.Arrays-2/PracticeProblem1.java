// Given an integer array nums, return true if any value appears 
// at least twice in the array, and return false if every element is distinct.

// Example 1:Input:nums = [1, 2, 3, 1]Output:   true 
// Example 2:Input:nums = [1, 2, 3, 4]Output:   false 
// Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true

import java.util.HashSet;

public class PracticeProblem1 {
    public static boolean checkRepetiveElements(int nums[]) {
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] == arr[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(checkRepetiveElements(nums));
        System.out.println(checkRepetiveElements(nums2));
        System.out.println(checkRepetiveElements(nums3));
    }

}
