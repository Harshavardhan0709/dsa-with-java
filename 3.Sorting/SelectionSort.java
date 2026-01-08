//Time Complexity-O(n^2)
//Space Complexity-O(1)

public class SelectionSort {
    public static void sortArray(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 4, 9, 0, -1, -100 };
        sortArray(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }

}
