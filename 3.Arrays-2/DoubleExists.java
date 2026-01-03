
import java.util.Arrays;
//Leet Code 1346Problem
// Check If N and Its Double Exist
// Given an array arr of integers, check if there exist two indices i and j such that :

//  Example 1:
// Input: arr = [10,2,5,3]
// Output: true
// Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

// Example 2:
// Input: arr = [3,1,7,11]
// Output: false
// Explanation: There is no i and j that satisfy the conditions.

//Time complexity-O(nlogn)
//Space complexity -O(1)

public class DoubleExists {
    static boolean bin(int arr[], int n, int target) {
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int target = arr[i] * 2;
            boolean result = bin(arr, n, target);
            if (result) {
                if (arr[i] == 0) {
                    if (i - 1 >= 0 && arr[i - 1] == 0) {
                        return true;
                    } else if (i + 1 < n && arr[i + 1] == 0) {
                        return true;
                    }
                } else
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 5, 3 }; // true 5->10
        int arr2[] = { 3, 1, 7, 11 }; // false
        // corner cases for 0
        int arr3[] = { 2, 3, 5, 0 }; // false 0->0 but present at same index
        int arr4[] = { 2, 5, 6, 0, 9, 0 };// true double zero and different index
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist(arr2));
        System.out.println(checkIfExist(arr3));
        System.out.println(checkIfExist(arr4));
    }
}
