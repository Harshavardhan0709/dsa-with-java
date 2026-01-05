//Time complexity-O(n)
//Space complexity -O(1)

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 3, 3 };
        System.out.println(removeElement(arr, 3));
    }

}