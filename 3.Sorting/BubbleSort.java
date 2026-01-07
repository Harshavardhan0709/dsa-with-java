//Time Complexity-O(n^2)
//Space Complexity-O(1)
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 4, 9, 0, -1, -100 };
        bubbleSort(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }
}
